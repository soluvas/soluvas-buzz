package org.soluvas.buzz.app;

import org.hibernate.jpa.boot.spi.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.web.site.AtmosphereApplication;

/**
 * @author ceefour
 *
 */
public class FrequencyJobApplication extends AtmosphereApplication {
	private static final Logger log = LoggerFactory
		.getLogger(FrequencyJobApplication.class);

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
