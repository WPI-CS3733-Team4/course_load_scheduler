package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.widgets.FacultyDataWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.user.client.ui.FlexTable;

/* Created by Nathan Siegel */
public class FacultyViewImpl extends BaseViewImpl<FacultyPresenter> implements FacultyView
{
	private static FacultyViewImplUiBinder uiBinder = GWT.create(FacultyViewImplUiBinder.class);
	
	interface FacultyViewImplUiBinder extends UiBinder<Widget, FacultyViewImpl>{}
	
	@UiField
	TextBox requestIdTextBox;
	
	@UiField
	TextBox facultyIdTextBox;
	
	@UiField
	TextBox courseSectionIdTextBox;
	
	@UiField
	Button requestButton;
	
	@UiField
	Button unrequestButton;
	
	@UiField
	HTMLPanel facultyPanel;
	
	@UiField
	FacultyDataWidget facultyData;
	
	public FacultyViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
				
	}
	
	@Override
	public TextBox getRequestIdTextBox()
	{
		return requestIdTextBox;
	}
	
	@Override
	public void setRequestIdTextBox(TextBox requestIdTextBox)
	{
		this.requestIdTextBox = requestIdTextBox;
	}
	
	@Override
	public TextBox getFacultyIdTextBox()
	{
		return facultyIdTextBox;
	}
	
	@Override
	public void setFacultyIdTextBox(TextBox facultyIdTextBox)
	{
		this.facultyIdTextBox = facultyIdTextBox;
	}
	
	@Override 
	public TextBox getCourseSectionIdTextBox()
	{
		return courseSectionIdTextBox;
	}
	
	@Override
	public void setCourseSectionIdTextBox(TextBox courseSectionIdTextBox)
	{
		this.courseSectionIdTextBox = courseSectionIdTextBox;
	}
	
		
	@Override
	public Button getRequestButton()
	{
		return requestButton;
	}
	
	@Override
	public Button getUnrequestButton()
	{
		return unrequestButton;
	}	

	@Override
	public void setPresenter(FacultyPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	@Override
	public void showErrorMessages(String errorMessages)
	{
		Window.alert(errorMessages);
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return facultyPanel;
	}
	
	@UiHandler("requestButton")
	void onRequestButtonClicked(ClickEvent evt)
	{
		presenter.requestCourse();
	}
	
	@UiHandler("unrequestButton")
	void onUnrequestButtonClicked(ClickEvent evt)
	{
		presenter.unrequestCourse();
	}

}
