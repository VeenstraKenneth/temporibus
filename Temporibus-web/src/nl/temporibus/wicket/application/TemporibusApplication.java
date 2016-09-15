package nl.temporibus.wicket.application;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import nl.temporibus.wicket.web.index.Index;

public class TemporibusApplication extends WebApplication  {

	@Override
	public Class<? extends WebPage> getHomePage() {
		return Index.class;
	}
	
	public void init(){
//		mountPage("/search", Search.class);
		mountPage("/index", Index.class);
//		mountPage("/about", About.class);
//		mountPage("/contact", Contact.class);
	}
}