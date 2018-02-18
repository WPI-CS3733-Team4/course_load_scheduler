package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyView;

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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.user.client.ui.FlexTable;

/* Created by Nathan Siegel */

public class FacultyViewImpl extends BaseViewImpl<FacultyPresenter> implements FacultyView
{
	private static FacultyViewImplUiBinder uiBinder = GWT.create(FacultyViewImplUiBinder.class);
	
	interface FacultyViewImplUiBinder extends UiBinder<Widget, FacultyViewImpl>{}
			
	@UiField
	Label viewLabel;
	
	@UiField
	Label requestIdLabel;
	
	@UiField
	Label facultyIdLabel;
	
	@UiField
	Label courseSectionIdLabel;
	
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
	VerticalPanel facultyPanel;
	
	@UiField
	FlexTable requestTable;
	
	@UiField
	FlexTable courseSectionTable;
	
	@UiField
	FlexTable courseTable;
	
	public FacultyViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
		
		requestTable.setBorderWidth(2);
		requestTable.setText(0, 0, "Request Id:");
		requestTable.setText(0, 1, "Faculty Id:");
		requestTable.setText(0, 2, "Course Section Id:");
		requestTable.setText(1, 0, "This");
		requestTable.setText(1, 1, "Is a");
		requestTable.setText(1, 2, "Test");
		
		courseSectionTable.setBorderWidth(2);
		courseSectionTable.setText(0, 0, "Course Section Id");
		courseSectionTable.setText(0, 1, "Course Id");
		courseSectionTable.setText(0, 2, "Section Type");
		
		courseTable.setBorderWidth(2);
		courseTable.setText(0, 0, "Course Id");
		courseTable.setText(0, 1, "Course Name");
		courseTable.setText(0, 2, "Course Description");
		
		//TODO:
		//use CourseRequest, CourseSection, and CourseTable models to populate the fields in the tables
		

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
	public FlexTable getRequestTable() {
		return requestTable;
	}
	
	@Override
	public void setRequestTable(FlexTable requestTable) {
		this.requestTable = requestTable;
	}
	
	@Override
	public FlexTable getCourseSectionTable() {
		return courseSectionTable;
	}
	
	@Override
	public void setCourseSectionTable(FlexTable courseSectionTable) {
		this.courseSectionTable = courseSectionTable;
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
