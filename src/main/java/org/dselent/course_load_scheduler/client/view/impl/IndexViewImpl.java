package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import org.dselent.course_load_scheduler.client.view.IndexView;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.view.AdminView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.CourseLoadScheduler;

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
	Button facultyButton;
	
	@UiField
	Button builderButton;
	
	@UiField
	Button adminButton;
	
	
	
	public Button getFacultyButton()
	{
		return facultyButton;
	}
	
	
	public Button getBuilderButton()
	{
		return builderButton;
	}
	
	
	public Button getAdminButton()
	{
		return adminButton;
	}
	
	public IndexViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
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
	 
	

	@UiHandler("adminButton")
	void onAdminButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.adminScreen();
	}
	
	@UiHandler("facultyButton")
	void onFacultyButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.facultyScreen();
	}
	
	@UiHandler("builderButton")
	void onBuilderButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.builderScreen();
	}

}
