package nl.temporibus.wicket.web.index;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import nl.temporibus.wicket.web.basePage.BasePage;

public class Index extends BasePage {
	private static final long	serialVersionUID	= 1L;

	public Index(final PageParameters parameters) {
		if (parameters.getNamedKeys().contains("feedback")) {
			add(new Label("feedback", parameters.get("feedback").toString()));
		} else {
			add(new Label("feedback"));
		}

		final TextField<String> searchRequest = new TextField<String>("searchValue", Model.of(""));
		searchRequest.setRequired(true);

		Form<?> form = new Form<Void>("searchForm") {
			private static final long	serialVersionUID	= 1L;

			@Override
			protected void onSubmit() {
				final String searchValue = searchRequest.getModelObject();
				PageParameters pageParameters = new PageParameters();
				pageParameters.add("searchValue", searchValue);
//				setResponsePage(Search.class, pageParameters);
			}
		};
		add(form);
		form.add(searchRequest);
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
	}
}
