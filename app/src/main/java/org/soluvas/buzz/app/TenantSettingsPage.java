package org.soluvas.buzz.app;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.SocialLink;

public class TenantSettingsPage extends TenantPage {

	@SpringBean
	private BuzzApp buzzApp;
	@SpringBean
	private BuzzAccount buzzAccount;

	public TenantSettingsPage(PageParameters parameters) {
		super(parameters);
		add(new Label("twitterKey", new PropertyModel<>(buzzApp, "twitterConsumer.consumerKey")));
		add(new Label("twitterSecret", new PropertyModel<>(buzzApp, "twitterConsumer.consumerSecret")));
		add(new Label("facebookAppId", new PropertyModel<>(buzzApp, "facebookConsumer.appId")));
		add(new Label("facebookAppKey", new PropertyModel<>(buzzApp, "facebookConsumer.appKey")));
		
		add(new ListView<SocialLink>("socialLinks", new PropertyModel<List<SocialLink>>(buzzAccount, "socialLinks")) {
			@Override
			protected void populateItem(ListItem<SocialLink> item) {
				item.add(new Label("provider", new PropertyModel<>(item.getModel(), "class.simpleName")));
				item.add(new Label("description", item.getModel()));
			}
		}.setRenderBodyOnly(true));
	}
	
}
