package org.soluvas.buzz.app;

import org.apache.wicket.Page;
import org.apache.wicket.request.resource.caching.FilenameWithVersionResourceCachingStrategy;
import org.apache.wicket.request.resource.caching.version.MessageDigestResourceVersion;
import org.apache.wicket.serialize.java.DeflatedJavaSerializer;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.web.site.AtmosphereApplication;

import com.google.javascript.jscomp.CompilationLevel;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.markup.html.RenderJavaScriptToFooterHeaderResponseDecorator;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.core.settings.DefaultThemeProvider;
import de.agilecoders.wicket.core.settings.ThemeProvider;
import de.agilecoders.wicket.extensions.javascript.GoogleClosureJavaScriptCompressor;
import de.agilecoders.wicket.extensions.javascript.YuiCssCompressor;

/**
 * @author ceefour
 *
 */
public class BuzzApplication extends AtmosphereApplication {
	private static final Logger log = LoggerFactory
		.getLogger(BuzzApplication.class);

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
	
	@Override
	protected void init() {
		super.init();
		
		getDebugSettings().setAjaxDebugModeEnabled(false);
		
		getComponentInstantiationListeners().add(
				new SpringComponentInjector(this));
		
		configureBootstrap();
		optimizeForWebPerformance();
		
		// X-Forwarded-Proto support, see http://apropos0.blogspot.com/2013/05/wicket-ssl-nginx.html
//		getFilterFactoryManager().addXForwardedRequestWrapperFactory(null);
		// notice that in most cases this should be done as the
		// last mounting-related operation because it replaces the root mapper
		// Seems that HttpsMapper is the culprit. Without HttpsMapper I never see this error.
		// https://issues.apache.org/jira/browse/WICKET-5282
//		setRootRequestMapper(new HttpsMapper(getRootRequestMapper(), new HttpsConfig()) {
//			@Override
//			protected Scheme getSchemeOf(Request request) {
//				final HttpServletRequest req = (HttpServletRequest) request.getContainerRequest();
//				log.trace("Scheme for request {} is {}", req, req.getScheme());
//				
//				if ("https".equalsIgnoreCase(req.getScheme()))
//				{
//					return Scheme.HTTPS;
//				}
//				else if ("http".equalsIgnoreCase(req.getScheme()))
//				{
//					return Scheme.HTTP;
//				}
//				else if ("WebSocket".equalsIgnoreCase(req.getScheme()))
//				{
//					return Scheme.ANY;
//				}
//				else
//				{
//					throw new IllegalStateException("Could not resolve protocol for request: " + req
//							+ ", unrecognized scheme: " + req.getScheme());
//				}
//			}
//		});
//		setRootRequestMapper(new HttpsMapper(getRootRequestMapper(), new HttpsConfig()) {
//			@Override
//			protected Scheme getDesiredSchemeFor(
//					Class<? extends IRequestablePage> pageClass) {
//				final HttpServletRequest servletRequest = (HttpServletRequest) RequestCycle.get().getRequest().getContainerRequest();
//				return servletRequest.isSecure() || super.getDesiredSchemeFor(pageClass) == Scheme.HTTPS ? Scheme.HTTPS : Scheme.ANY;
//			}
//			
//			@Override
//			protected Scheme getDesiredSchemeFor(IRequestHandler handler) {
//				final HttpServletRequest servletRequest = (HttpServletRequest) RequestCycle.get().getRequest().getContainerRequest();
//				return servletRequest.isSecure() ? Scheme.HTTPS : Scheme.ANY;
//			}
//		});
		
		mountPages();
	}
	
    private void mountPages() {
    	/* Atmosphere bug: Any URI with first path segment containing '_' will throw:
    	 * org.atmosphere.cpr.AtmosphereMappingException: No AtmosphereHandler maps request for /_
    	 * 	org.atmosphere.cpr.AsynchronousProcessor.map(AsynchronousProcessor.java:400)
    	 * 	org.atmosphere.cpr.AsynchronousProcessor.action(AsynchronousProcessor.java:204)
    	 * 	org.atmosphere.cpr.AsynchronousProcessor.suspended(AsynchronousProcessor.java:166)
    	 * 	org.atmosphere.container.Tomcat7CometSupport.service(Tomcat7CometSupport.java:88)
    	 * 	org.atmosphere.container.Tomcat7AsyncSupportWithWebSocket.doService(Tomcat7AsyncSupportWithWebSocket.java:63)
    	 * 	org.atmosphere.container.TomcatWebSocketUtil.doService(TomcatWebSocketUtil.java:87)
    	 * 	org.atmosphere.container.Tomcat7AsyncSupportWithWebSocket.service(Tomcat7AsyncSupportWithWebSocket.java:59)
    	 * 	org.atmosphere.cpr.AtmosphereFramework.doCometSupport(AtmosphereFramework.java:1441)
    	 * 	org.atmosphere.cpr.AtmosphereServlet.event(AtmosphereServlet.java:361)
    	 * 	org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:502)
    	 * 	org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:99)
    	 * 	org.apache.catalina.valves.AccessLogValve.invoke(AccessLogValve.java:953)
    	 * 	org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:408)
    	 * 	org.apache.coyote.http11.AbstractHttp11Processor.process(AbstractHttp11Processor.java:1023)
    	 * 	org.apache.coyote.AbstractProtocol$AbstractConnectionHandler.process(AbstractProtocol.java:589)
    	 * 	org.apache.tomcat.util.net.AprEndpoint$SocketWithOptionsProcessor.run(AprEndpoint.java:1810)
    	 * 	java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
    	 * 	java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
    	 * 	java.lang.Thread.run(Thread.java:724)
    	 */
    	mountPage("tenantsettings", TenantSettingsPage.class);
	}

	/**
     * configures wicket-bootstrap and installs the settings.
     */
    private void configureBootstrap() {
        final ThemeProvider themeProvider = new DefaultThemeProvider() {{
//        	addDefaultTheme(new QuikdoTheme());
        }};

        final BootstrapSettings settings = new BootstrapSettings();
        settings.setJsResourceFilterName("footer-container");
        settings.setThemeProvider(themeProvider);
        Bootstrap.install(this, settings);

//        final IBootstrapLessCompilerSettings lessCompilerSettings = new BootstrapLessCompilerSettings();
//        lessCompilerSettings.setUseLessCompiler(usesDevelopmentConfig())
//                .setLessCompiler(new Less4JCompiler());
//        BootstrapLess.install(this, lessCompilerSettings);
    }

    /**
     * optimize wicket for a better web performance
     */
    private void optimizeForWebPerformance() {
        if (usesDeploymentConfig()) {
            getResourceSettings().setCachingStrategy(new FilenameWithVersionResourceCachingStrategy(
                    new MessageDigestResourceVersion()
            ));

            getResourceSettings().setJavaScriptCompressor(new GoogleClosureJavaScriptCompressor(CompilationLevel.SIMPLE_OPTIMIZATIONS));
            getResourceSettings().setCssCompressor(new YuiCssCompressor());

            getFrameworkSettings().setSerializer(new DeflatedJavaSerializer(getApplicationKey()));
        }

        setHeaderResponseDecorator(new RenderJavaScriptToFooterHeaderResponseDecorator());
    }

}
