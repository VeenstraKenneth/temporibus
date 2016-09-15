package nl.temporibus.wicket.web.basePage;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import nl.temporibus.wicket.web.index.Index;

public class BasePage extends WebPage {
	private static final long	serialVersionUID	= 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BasePage() {
		add(new BookmarkablePageLink("index", Index.class));
//		add(new BookmarkablePageLink("index_title", Index.class));
//		add(new BookmarkablePageLink("about", About.class));
//		add(new BookmarkablePageLink("contact", Contact.class));
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forUrl("https://code.jquery.com/qunit/qunit-1.22.0.js"));
		response.render(JavaScriptHeaderItem.forUrl("http://code.jquery.com/jquery-1.10.2.js"));
		response.render(JavaScriptHeaderItem.forUrl("./vendor/underscore-1.5.2.js"));

		response.render(CssHeaderItem.forUrl("./vendor/page/style.css"));
	}
}
