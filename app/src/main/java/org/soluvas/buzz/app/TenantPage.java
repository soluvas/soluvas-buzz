package org.soluvas.buzz.app;

import org.apache.wicket.extensions.breadcrumb.BreadCrumbBar;
import org.apache.wicket.markup.head.filter.HeaderResponseContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.web.bootstrap.GrowlBehavior;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.BootstrapBaseBehavior;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.HtmlTag;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.MobileViewportMetaTag;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.ImmutableNavbarComponent;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar.ComponentPosition;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.Navbar.Position;
import de.agilecoders.wicket.core.markup.html.bootstrap.navbar.NavbarButton;

/**
 * @author ceefour
 *
 */
@SuppressWarnings("serial")
public class TenantPage extends WebPage {

	protected Navbar navbar;

	public TenantPage() {
		super();
	}

	public TenantPage(IModel<?> model) {
		super(model);
	}

	public TenantPage(PageParameters parameters) {
		super(parameters);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(new HtmlTag("html"));
        add(new MobileViewportMetaTag("viewport"));
        
		add(new BootstrapBaseBehavior());
		add(new GrowlBehavior());
		add(new HeaderResponseContainer("footer-container", "footer-container"));
		
		navbar = new Navbar("navbar");
		navbar.setOutputMarkupId(true);
		navbar.setPosition(Position.TOP);
		navbar.setBrandName(new Model<>("Buzz"));
		navbar.addComponents(new ImmutableNavbarComponent(new NavbarButton<>(TenantSettingsPage.class, new Model<>("Tenant Settings")), 
				ComponentPosition.RIGHT));
		add(navbar);

		final BreadCrumbBar breadCrumbBar = new BreadCrumbBar("breadCrumbBar");
		add(breadCrumbBar);
	}
	
}
