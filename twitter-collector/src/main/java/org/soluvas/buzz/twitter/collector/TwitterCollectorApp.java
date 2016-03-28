package org.soluvas.buzz.twitter.collector;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.ProxyConfig;
import org.soluvas.commons.config.CommonsWebConfig;
import org.soluvas.socmed.TwitterApp;
import org.soluvas.socmed.TwitterAuthorization;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataIntegrityViolationException;
import twitter4j.*;
import twitter4j.auth.AccessToken;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

//@EnableAutoConfiguration
@SpringBootApplication(exclude = {
        JmxAutoConfiguration.class
})
@Profile("twittercollector")
@Import({CommonsWebConfig.class})
//@ComponentScan(excludeFilters=@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=CommandLineRunner.class))
public class TwitterCollectorApp implements CommandLineRunner {

    public static final int COLLECT_WAIT_MS = 20000;
    private static Logger log = LoggerFactory.getLogger(TwitterCollectorApp.class);
    public static final double INDONESIA_CENTER_LAT = -2.7;
    public static final double INDONESIA_CENTER_LON = 117.0;
    public static final DateTimeZone WIB = DateTimeZone.forID("Asia/Jakarta");

    @Inject
    private Environment env;
    @Inject
    private TwitterStatusRepository tweetRepo;
    @Inject
    private CloseableHttpClient httpClient;
    @Inject
    private DataSource dataSource;
    @Inject
    private ObjectMapper mapper;

    enum CollectMode {
        USER,
        MENTIONS,
        BOTH
    }

    static class Params {
        @Parameter(names = {"--app", "-a"}, description = "Use specified TwitterApp configuration, i.e. 'config/${APP_ID}.TwitterApp.jsonld'.")
        String twitterAppId = "buzz";
        @Parameter(names = {"--auth", "-u"}, required = true, description = "Use specified TwitterAuthorization configuration, i.e. 'config/${AUTH_ID}.TwitterAuthorization.jsonld'.")
        String twitterAuthorizationId;
        @Parameter(names = {"--mode", "-m"}, description = "Collect from user's tweets (USER), mentions (MENTIONS), or both (BOTH).")
        CollectMode mode = CollectMode.BOTH;
        //        @Parameter(names = {"--table", "-t"}, required = true, description = "PostgreSQL table name to store the collected tweets into.")
//        String tableName; // "helpdesk_tweet";
//        @Parameter(names = "--since", description = "ISO8601 formatted timestamp to start monitoring tweets. I think earliest by Twitter's limitation is 1 week ago.")
//        String since;
        @Parameter(names = {"--project", "-p"}, required = true, description = "Project ID, e.g. 'helpdesk'.")
        String projectId;
        @Parameter(arity = 1, required = true)
        List<String> screenNames; // "indosatcare"
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(TwitterCollectorApp.class)
                .profiles("useSpringJackson", "twitter", "twittercollector")
                .web(false)
                .run(args);
    }

//    public Tweet insertTweet(String tableName, Tweet tweet) {
//        final NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
//        final SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName(tableName);
//        final Number key = jdbcInsert.executeAndReturnKey(new BeanPropertySqlParameterSource(tweet));
//        return tweet;
//    }

    @Override
    public void run(String... args) throws Exception {

        final GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);

        final Params params = new Params();
        final JCommander jc = new JCommander(params, args);

        final File twitterAppFile = new File("config", params.twitterAppId + ".TwitterApp.jsonld");
        final TwitterApp twitterApp = mapper.readValue(twitterAppFile, TwitterApp.class);
        final File twitterAuthFile = new File("config", params.twitterAppId + "-" + params.twitterAuthorizationId + ".TwitterAuthorization.jsonld");
        final TwitterAuthorization twitterAuth = mapper.readValue(twitterAuthFile, TwitterAuthorization.class);
        final Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(twitterApp.getApiKey(), twitterApp.getApiSecret());
        twitter.setOAuthAccessToken(new AccessToken(twitterAuth.getAccessToken(), twitterAuth.getAccessTokenSecret()));

        final String screenName = params.screenNames.get(0);
        LocalDate until = new LocalDate(WIB).minusDays(6);
        Long since = 0l; // oldest
        while (true) {
            final DateTime fetchTime = new DateTime();
//            log.info("Collecting tweets since ID {} ...", since);
            log.info("Collecting tweets since {} until {} ...", since, until);
            final String queryStr;
            switch (params.mode) {
                case BOTH:
                    queryStr = "from:" + screenName + " OR @" + screenName;
                    break;
                case USER:
                    queryStr = "from:" + screenName;
                    break;
                case MENTIONS:
                    queryStr = "@" + screenName;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported mode: " + params.mode);
            }
            Query query = new Query(queryStr).count(100)
                    //.geoCode(new GeoLocation(INDONESIA_CENTER_LAT, INDONESIA_CENTER_LON), 2000, SI.KILOMETRE.toString()) // Indonesia. TODO: use JSR36 in the future
                    .sinceId(since)
                    .until(until.toString())
                    .resultType(Query.ResultType.recent);
            final QueryResult results = twitter.search(query);
            log.info("Got {} tweets this time", results.getTweets().size());
            for (Status status : results.getTweets()) {
                if (since == null || status.getId() > since) {
                    since = status.getId();
                }

                log.trace("@{}'s UTC offset={}", status.getUser().getStatus(), status.getUser().getUtcOffset());
                final Optional<DateTimeZone> timeZone = status.getUser().getUtcOffset() != -1 ? Optional.of(DateTimeZone.forOffsetMillis(status.getUser().getUtcOffset() * 1000))
                        : Optional.empty();
                final DateTime creationTime = new DateTime(status.getCreatedAt(), timeZone.orElse(DateTimeZone.UTC));
                log.info("@{} {} {}: {} * {} * {} * {}", status.getUser().getScreenName(), creationTime, status.getId(), status.getText(),
                        status.getPlace() != null ? status.getPlace().getFullName() : "N/A",
                        status.getGeoLocation() != null ? status.getGeoLocation().getLatitude() + "," + status.getGeoLocation().getLongitude() : "N/A",
                        creationTime);

                final TwitterStatus tweet = new TwitterStatus();
                tweet.setProjectId(params.projectId);
                tweet.setStatusId(status.getId());
                tweet.setTimeZone(timeZone.orElse(null));
                tweet.setCreationTime(creationTime);
                tweet.setFetchTime(fetchTime);
                tweet.setText(status.getText());
                tweet.setLang(Locale.forLanguageTag(status.getLang()));
                tweet.setRetweet(status.isRetweet());
                tweet.setInReplyToStatusId(status.getInReplyToStatusId() != -1 ? status.getInReplyToStatusId() : null);
                tweet.setInReplyToScreenName(status.getInReplyToScreenName());
                tweet.setInReplyToUserId(status.getInReplyToUserId() != -1 ? status.getInReplyToUserId() : null);

                tweet.setUserId(status.getUser().getId());
                tweet.setUserScreenName(status.getUser().getScreenName());
                tweet.setUserName(status.getUser().getName());
                tweet.setUserLocation(status.getUser().getLocation());
                tweet.setUserLang(Locale.forLanguageTag(status.getUser().getLang()));
                if (status.getPlace() != null) {
                    tweet.setPlaceId(status.getPlace().getId());
                    tweet.setPlaceType(status.getPlace().getPlaceType());
                    tweet.setPlaceName(status.getPlace().getName());
                    tweet.setPlaceFullName(status.getPlace().getFullName());
                    tweet.setPlaceStreetAddress(status.getPlace().getStreetAddress());
                    tweet.setPlaceCountry(status.getPlace().getCountry());
                    tweet.setPlaceCountryCode(status.getPlace().getCountryCode());
                    tweet.setPlaceUri(status.getPlace().getURL());
                    log.info("boundingBox for #{} @{}: {}", status.getId(), status.getUser().getScreenName(), status.getPlace().getBoundingBoxCoordinates()[0]);
                    final Coordinate[] coordinates = ImmutableList.<GeoLocation>builder()
                            .addAll(Arrays.asList(status.getPlace().getBoundingBoxCoordinates()[0]))
                            .add(status.getPlace().getBoundingBoxCoordinates()[0][0]).build().stream()
                            .map(it -> new Coordinate(it.getLongitude(), it.getLatitude()))
                            .toArray(Coordinate[]::new);
                    tweet.setPlaceBoundingBox(geometryFactory.createPolygon(coordinates));
                    tweet.setPlaceBoundingBoxType(status.getPlace().getBoundingBoxType());
                    tweet.setPlaceBoundingBoxSwLat(status.getPlace().getBoundingBoxCoordinates()[0][1].getLatitude());
                    tweet.setPlaceBoundingBoxSwLon(status.getPlace().getBoundingBoxCoordinates()[0][1].getLongitude());
                    tweet.setPlaceBoundingBoxNeLat(status.getPlace().getBoundingBoxCoordinates()[0][3].getLatitude());
                    tweet.setPlaceBoundingBoxNeLon(status.getPlace().getBoundingBoxCoordinates()[0][3].getLongitude());
                }
                if (status.getGeoLocation() != null) {
                    tweet.setPoint(geometryFactory.createPoint(new Coordinate(status.getGeoLocation().getLongitude(), status.getGeoLocation().getLatitude())));
                    tweet.setLat(status.getGeoLocation().getLatitude());
                    tweet.setLon(status.getGeoLocation().getLongitude());
                }

                if (status.getMediaEntities() != null && status.getMediaEntities().length >= 1) {
                    final MediaEntity media = status.getMediaEntities()[0];
                    tweet.setMediaId(media.getId());
                    tweet.setMediaType(media.getType());
                    tweet.setMediaNormalUri(media.getURL());
                    tweet.setMediaDisplayUri(media.getDisplayURL());
                    tweet.setMediaExpandedUri(media.getExpandedURL());
                    tweet.setMediaUriHttp(media.getMediaURL());
                    tweet.setMediaUriHttps(media.getMediaURLHttps());
                    tweet.setMediaText(media.getText());
                    tweet.setMediaSizes(mapper.writeValueAsString(media.getSizes()));

                    final MediaEntity.Size origMediaSize = Iterables.getLast(media.getSizes().entrySet()).getValue();
                    tweet.setMediaWidth(origMediaSize.getWidth());
                    tweet.setMediaHeight(origMediaSize.getHeight());
                    tweet.setMediaExtension(FilenameUtils.getExtension(media.getMediaURL()));

                    if ("photo".equals(tweet.getMediaType())) {
                        final HttpGet httpGet = new HttpGet(tweet.getMediaUriHttp());
                        try (final CloseableHttpResponse resp = httpClient.execute(httpGet)) {
                            tweet.setMediaContentType(resp.getEntity().getContentType().getValue());
                            tweet.setMediaContent(IOUtils.toByteArray(resp.getEntity().getContent()));
                            //roadTweet.setMediaContentLength((int) resp.getEntity().getContentLength()); // NOT RELIABLE, sometimes returns -1
                            tweet.setMediaContentLength(tweet.getMediaContent().length);
                        }
                    }
                }

                try {
                    tweetRepo.save(tweet);
                } catch (DataIntegrityViolationException integrityE) {
                    if (integrityE.getMessage().contains("uk_twitterstatus_project_id_statusid")) {
                        log.info("Skipping existing status #{} @{}: {}",
                                tweet.getStatusId(), tweet.getUserScreenName(), tweet.getText());
                    } else {
                        throw integrityE;
                    }
                }
            }

            final LocalDate today = new LocalDate(WIB);
            if (until.isBefore(today.plusDays(1))) {
                until = until.plusDays(1);
            }

            log.info("Waiting {}ms before next collect (since ID {}, until {}), press Ctrl+C to exit...", COLLECT_WAIT_MS, since, until);
            Thread.sleep(COLLECT_WAIT_MS);
        }
    }
}
