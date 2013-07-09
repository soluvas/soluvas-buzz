package org.soluvas.buzz.twitter;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=TestContextLoader.class, locations="/META-INF/spring/buzz-twitter.xml")
@PropertySource("classpath:/META-INF/jpa.properties")
public class TwitterCorpusTest {

	private ClassPathXmlApplicationContext appCtx;

	@Before
	public void setUp() throws Exception {
//		appCtx = new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/buzz-twitter.xml"}, false);
//		appCtx.getEnvironment().getPropertySources().addFirst(new ResourcePropertySource("classpath:/META-INF/jpa.properties"));
//		appCtx.refresh();
	}

	@After
	public void tearDown() throws Exception {
//		appCtx.close();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
