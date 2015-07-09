package org.soluvas.buzz.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.data.EntityLookupException;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by ceefour on 6/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class,
    classes=BuzzConfig.class)
@ActiveProfiles("autolike")
public class BuzzAccountTest {

    private static final Logger log = LoggerFactory.getLogger(BuzzAccountTest.class);

    @Inject
    private Environment env;
    @Inject
    private BuzzConfig buzzConfig;
    @Inject
    private BuzzAccountRepository buzzAccountRepo;

    @Configuration
    public static class Config {

    }

    @Before
    public void setUp() {
    }

    @Test
    public void app() throws IOException {
        final BuzzApp theBuzz = buzzConfig.buzzApps().get("buzz");
        log.info("App buzz: {}", theBuzz);
        Assert.assertThat(buzzConfig.buzzApps().keySet(), Matchers.hasItem("buzz"));
    }

    @Test
    public void account() throws IOException, EntityLookupException {
        final BuzzAccount gigastic = buzzAccountRepo.findOne("buzz", "gigastic");
        log.info("Gigastic: {}", gigastic);
        Assert.assertNotNull(gigastic);
    }

}
