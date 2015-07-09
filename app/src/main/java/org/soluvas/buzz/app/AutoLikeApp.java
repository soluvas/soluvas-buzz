package org.soluvas.buzz.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Profile;

/**
 * Auto-like and/or follow (socmed-independent).
 * In Twitter-speak, this means RT, favorite, quote, and/or follow.
 */
@SpringBootApplication(exclude=
        LiquibaseAutoConfiguration.class // java.lang.IllegalStateException: Cannot find changelog location: class path resource [db/changelog/db.changelog-master.yaml] (please add changelog or check your Liquibase configuration)
)
//@Configuration
//@ComponentScan(excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE, value=CommandLineRunner.class))
//@EnableAutoConfiguration(exclude=
//        LiquibaseAutoConfiguration.class // java.lang.IllegalStateException: Cannot find changelog location: class path resource [db/changelog/db.changelog-master.yaml] (please add changelog or check your Liquibase configuration)
//)
//@Import({CommonsWebConfig.class, PostgresConfig.class, ScheduleLiquibaseConfig.class, ScheduleConfig.class,
//        MultiTenantWebConfig.class, StarterSysConfigConfig.class, MultiTenantWebAddressConfig.class,
//        MongoPersonConfig.class})
@Profile("autolike")
public class AutoLikeApp {

    private static final Logger log = LoggerFactory.getLogger(AutoLikeApp.class);

    public static void main(String[] args) {
        final SpringApplicationBuilder builder = new SpringApplicationBuilder()
                .sources(AutoLikeApp.class)
                .profiles("autolike");
        builder.run(args);
    }

}
