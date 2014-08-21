package org.soluvas.buzz.core;

import java.beans.PropertyVetoException;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.hibernate.cfg.DefaultComponentSafeNamingStrategy;
import org.hibernate.dialect.PostgreSQL9Dialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.jpa.SoluvasMultiTenantConnectionProviderImpl;
import org.soluvas.jpa.SoluvasTenantIdentifierResolver;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.google.common.collect.ImmutableMap;

@Configuration
@Import({DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class BuzzSqlConfig {
	
	private static final Logger log = LoggerFactory
			.getLogger(BuzzSqlConfig.class);
	
	@Inject
	DataSource dataSource;
	
	@Bean @Primary
	public JpaTransactionManager transactionManager() throws PropertyVetoException {
		return new JpaTransactionManager(entityManagerFactory().getObject());
	}
	
	/**
	 * The {@link JpaTransactionManager} <b>must</b> be marked {@link Primary}, otherwise you'll get {@link NoUniqueBeanDefinitionException}.
	 * @return
	 */
	@Bean
	public DataSourceTransactionManager dsTxMgr() {
		return new DataSourceTransactionManager(dataSource);
	}
	
//	public static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
	
	/**
	  * We use {@link Environment#getRequiredProperty(String)} because the
	  * sqlUrl, sqlUser, and sqlPassword are app-scoped configuration,
	  * since we use SCHEMA-based multitenancy.
	  */
	@Inject
	private Environment env;
	@Inject
	private ApplicationContext appCtx;
////	@Inject
////	private DataSource dataSource;
////	@Inject
////	private EntityManagerFactory entityManagerFactory;
//	
//	@PreDestroy
//	public void destroy() {
//		SoluvasMultiTenantConnectionProviderImpl.dataSource = null;
//		SoluvasTenantIdentifierResolver.appCtx = null;
//	}
//	
//	@Bean(destroyMethod="close")
//	public ComboPooledDataSource dataSource() throws PropertyVetoException {
//		final String jdbcUrl = env.getRequiredProperty("sqlUrl");
//		final String jdbcUser = env.getRequiredProperty("sqlUser");
//		final String jdbcPassword = env.getRequiredProperty("sqlPassword");
//		log.info("Initializing c3p0 Connection Pool to {} as '{}'", jdbcUrl, jdbcUser);
//		final ComboPooledDataSource cpds = new ComboPooledDataSource();
//		try {
//			cpds.setDriverClass(POSTGRESQL_DRIVER);
//		} catch (PropertyVetoException e) {
//			throw new RuntimeException("Cannot load PostgreSQL driver " + POSTGRESQL_DRIVER + ": " + e, e);
//		}
//		
////		cpds.setConnectionCustomizerClassName(SoluvasConnectionCustomizer.class.getName());
//		cpds.setAutoCommitOnClose(false);
//		cpds.setJdbcUrl(jdbcUrl);
//		cpds.setUser(jdbcUser);
//		cpds.setPassword(jdbcPassword);
//		cpds.setTestConnectionOnCheckin(true);
//		return cpds;
//	}
	
	/**
	 * To override Spring Boot's, the {@link Bean} name must be {@code entityManagerFactory}.
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException {
		// Workaround :(
		SoluvasMultiTenantConnectionProviderImpl.dataSource = dataSource;
		SoluvasTenantIdentifierResolver.appCtx = appCtx;
		
		/**
		  * So the list of possible options are,
		  *  
		  *     validate: validate the schema, makes no changes to the database. 
		  *     update: update the schema. 
		  *     create: creates the schema, destroying previous data. 
		  *     create-drop: drop the schema at the end of the session. 
		  */
		final String jpaHbm2DdlAuto = env.getRequiredProperty("spring.jpa.hibernate.ddl-auto");
		log.info("JPA schema configuration: hbm2ddlauto={}", jpaHbm2DdlAuto);
		final LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("buzzPU"); // persistence.xml
		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factoryBean.setPersistenceXmlLocation("classpath*:META-INF/donotparsepersistence.xml");
//		factoryBean.setPersistenceUnitManager(new DefaultPersistenceUnitManager().set);
		factoryBean.setPackagesToScan("org.soluvas.buzz.core.jpa");
		final Map<String, Object> propertyMap = ImmutableMap.<String, Object>builder()
		// hbm2ddl.auto not supported with multitenancy: https://forum.hibernate.org/viewtopic.php?p=2468078
			.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, jpaHbm2DdlAuto)
	    // Must be supplied, otherwise you won't get JPA 2.1 @Index support
	    // "You must specify a SQL Dialect via the hibernate.dialect property when using schema generation"
			.put(org.hibernate.cfg.Environment.DIALECT, PostgreSQL9Dialect.class.getName())
		// Write all SQL statements to the <b>console</b> (which we don't want, since we use shell). 
		// This is an alternative to setting the log category org.hibernate.SQL to debug.
		// So please configure via logback.xml instead.
			.put(org.hibernate.cfg.Environment.SHOW_SQL, false)
			.put(org.hibernate.cfg.Environment.FORMAT_SQL, true)
			.put(org.hibernate.cfg.Environment.USE_SQL_COMMENTS, true)
		// https://hibernate.atlassian.net/browse/ANN-99?focusedCommentId=22432&page=com.atlassian.jira.plugin.system.issuetabpanels:comment-tabpanel#comment-22432
			.put(org.hibernate.ejb.HibernatePersistence.NAMING_STRATEGY, DefaultComponentSafeNamingStrategy.class.getName())
			.build();
		// Schema-based Multi-tenancy
		// http://docs.jboss.org/hibernate/core/4.2/devguide/en-US/html/ch16.html
		// https://community.jboss.org/message/838997
//		propb.put(org.hibernate.cfg.Environment.MULTI_TENANT, 
//				MultiTenancyStrategy.SCHEMA);
//		propb.put(org.hibernate.cfg.Environment.MULTI_TENANT_CONNECTION_PROVIDER, 
//				SoluvasMultiTenantConnectionProviderImpl.class);
//		propb.put(org.hibernate.cfg.Environment.MULTI_TENANT_IDENTIFIER_RESOLVER,
//				SoluvasTenantIdentifierResolver.class);
		factoryBean.setJpaPropertyMap(propertyMap);
		return factoryBean;
	}

//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter() {
//		return new HibernateJpaVendorAdapter();
//	}
//
////	@Bean
////	public JpaTransactionManager transactionManager() throws Exception {
////		return new JpaTransactionManager(entityManagerFactory);
////	}
//	
//	@Bean @Primary
//	public JpaTransactionManager transactionManager() throws Exception {
//		return new JpaTransactionManager(sanadPU().getObject());
//	}
//	
//	@Bean
//	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//		return new PersistenceExceptionTranslationPostProcessor();
//	}

}
