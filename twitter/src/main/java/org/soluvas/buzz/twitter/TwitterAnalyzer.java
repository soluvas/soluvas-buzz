package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.TwitterAppLink;
import org.soluvas.buzz.core.TwitterUserLink;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author ceefour
 *
 */
public class TwitterAnalyzer {

	private final Twitter twitter;

	/**
	 * 
	 */
	public TwitterAnalyzer(TwitterAppLink app, TwitterUserLink appUser) {
		final ConfigurationBuilder configBuilder = new ConfigurationBuilder();
		configBuilder.setOAuthConsumerKey(app.getConsumerKey());
		configBuilder.setOAuthConsumerSecret(app.getConsumerSecret());
		configBuilder.setDebugEnabled(true);
		configBuilder.setGZIPEnabled(true);
		configBuilder.setOAuthAccessToken(appUser.getToken());
		configBuilder.setOAuthAccessTokenSecret(appUser.getTokenSecret());
		final Configuration config = configBuilder.build();
		TwitterFactory twitterFactory = new TwitterFactory(config);
		twitter = twitterFactory.getInstance();
	}

}
