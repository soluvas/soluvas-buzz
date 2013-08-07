package org.soluvas.buzz.app;

import org.apache.wicket.extensions.breadcrumb.BreadCrumbBar;
import org.apache.wicket.markup.head.filter.HeaderResponseContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.web.bootstrap.GrowlBehavior;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.BootstrapBaseBehavior;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.HtmlTag;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.OptimizedMobileViewportMetaTag;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar.Position;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;
	private final Navbar navbar;

	public HomePage(PageParameters parameters) {
		super(parameters);

		add(new HtmlTag("html"));
        add(new OptimizedMobileViewportMetaTag("viewport"));
        
		add(new BootstrapBaseBehavior());
		add(new GrowlBehavior(false));
		add(new HeaderResponseContainer("footer-container", "footer-container"));
		
		navbar = new Navbar("navbar");
		navbar.setOutputMarkupId(true);
		navbar.setPosition(Position.TOP);
		add(navbar.brandName(new Model<>("Buzz")));

		final BreadCrumbBar breadCrumbBar = new BreadCrumbBar("breadCrumbBar");
		add(breadCrumbBar);
	}
	
}
