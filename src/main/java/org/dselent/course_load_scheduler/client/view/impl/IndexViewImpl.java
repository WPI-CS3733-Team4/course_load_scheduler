package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;

import org.dselent.course_load_scheduler.client.widgets.NavBarWidget;


public class IndexViewImpl extends BaseViewImpl<IndexPresenter> implements IndexView
{
	private static IndexViewImplUiBinder uiBinder = GWT.create(IndexViewImplUiBinder.class);

	interface IndexViewImplUiBinder extends UiBinder<Widget, IndexViewImpl> {}

    @UiField//(provided = true)
	HTMLPanel mainPanel;
	
	@UiField
	Image loadingImage;
	
	@UiField
	PopupPanel glassLoadingPanel;
	
	@UiField
	NavBarWidget navbar;
	
	public IndexViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
		//presenter.sendTableRequests();
	}

	@Override
	public HTMLPanel getMainPanel()
	{
		return mainPanel;
	}

	@Override
	public void setMainPanel(HTMLPanel mainPanel)
	{
		this.mainPanel = mainPanel;
	}

	@Override
	public void setPresenter(IndexPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	@Override
	public PopupPanel getGlassLoadingPanel()
	{
		return glassLoadingPanel;
	}
	
	@Override
	public Image getLoadingImage()
	{
		return loadingImage;
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return mainPanel;
	}

}
