package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.BuilderPresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BuilderView;
import org.dselent.course_load_scheduler.client.widgets.BuilderDataWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

/* Created by Michael Capobianco */

public class BuilderViewImpl extends BaseViewImpl<BuilderPresenter> implements BuilderView
{
	private static BuilderViewImplUiBinder uiBinder = GWT.create(BuilderViewImplUiBinder.class);
	
	interface BuilderViewImplUiBinder extends UiBinder<Widget, BuilderViewImpl>{}
			
	//Courses
	@UiField
	TextBox courseIdTextBox;
	
	@UiField
	TextBox courseNameTextBox;
	
	@UiField
	TextBox courseDeptTextBox;
	
	@UiField
	TextBox courseDescriptionTextBox;
		
	@UiField
	Button addCoursesButton;
	
	@UiField
	Button modifyCoursesButton;
	
	@UiField
	Button removeCoursesButton;

	
	//Course Sections
	@UiField
	TextBox courseSectionIdTextBox;
	
	@UiField
	TextBox courseTextBox;

	@UiField
	TextBox sectionTypeTextBox;
	
	@UiField
	TextBox termTextBox;
	
	@UiField
	Button addSectionsButton;
	
	@UiField
	Button modifySectionsButton;
	
	@UiField
	Button removeSectionsButton;
	
	
	
	
	//Course Section Times
	@UiField
	TextBox courseSectionTimeIdTextBox;
	
	@UiField
	TextBox courseSectionTextBox;
	
	@UiField
	TextBox startTimeTextBox;
	
	@UiField
	TextBox endTimeTextBox;
	
	@UiField
	TextBox dayOfWeekTextBox;
	
	@UiField
	TextBox locationTextBox;
	
	@UiField
	Button addCourseSectionTimesButton;
	
	@UiField
	Button modifyCourseSectionTimesButton;
	
	@UiField
	Button removeCourseSectionTimesButton;
	
	
	//Locations
	@UiField
	TextBox locationIdTextBox;
	
	@UiField
	TextBox buildingTextBox;
	
	@UiField
	TextBox roomTextBox;
	
	@UiField
	TextBox roomSizeTextBox;
	
	@UiField
	Button addLocationsButton;
	
	@UiField
	Button modifyLocationsButton;
	
	@UiField
	Button removeLocationsButton;
	
	//Departments
	@UiField
	TextBox departmentIdTextBox;
	
	@UiField
	TextBox departmentTextBox;
	
	@UiField
	Button addDepartmentsButton;
	
	@UiField
	Button modifyDepartmentsButton;
	
	@UiField
	Button removeDepartmentsButton;
	
	//Terms
	@UiField
	TextBox termIdTextBox;
	
	@UiField
	TextBox termNameTextBox;
	
	@UiField
	Button addTermsButton;
	
	@UiField
	Button modifyTermsButton;
	
	@UiField
	Button removeTermsButton;
	
	@UiField
	HTMLPanel builderPanel;	
	
	@UiField
	Button confirmRequestButton;
	
	@UiField
	BuilderDataWidget builderData;
	
	@UiField 
	FlexTable locationTable;

	@UiField 
	FlexTable deptTable;

	@UiField 
	FlexTable termTable;
	
	
	/*
	@UiField
	VerticalPanel facultyPanel;
	*/
	
	public BuilderViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
		
		locationTable.setBorderWidth(2);
		locationTable.setText(0, 0, "Location ID");
		locationTable.setText(0, 1, "Building");
		locationTable.setText(0, 2, "Room");
		locationTable.setText(0,3, "Room Size");
		
		deptTable.setBorderWidth(2);
		deptTable.setText(0, 0, "Department ID");
		deptTable.setText(0, 1, "Department");
		
		termTable.setBorderWidth(2);
		termTable.setText(0, 0, "Term ID");
		termTable.setText(0, 1, "Term Name");
	}
	
	public TextBox getCourseTextBox() {
		return courseTextBox;
	}
	
	public void setCourseTextBox(TextBox courseTextBox) {
		this.courseTextBox = courseTextBox;
	}

	public TextBox getCourseIdTextBox() {
		return courseIdTextBox;
	}

	public void setCourseIdTextBox(TextBox courseIdTextBox) {
		this.courseIdTextBox = courseIdTextBox;
	}

	public TextBox getCourseNameTextBox() {
		return courseNameTextBox;
	}

	public void setCourseNameTextBox(TextBox courseNameTextBox) {
		this.courseNameTextBox = courseNameTextBox;
	}

	public TextBox getCourseDeptTextBox() {
		return courseDeptTextBox;
	}

	public void setCourseDeptTextBox(TextBox courseDeptTextBox) {
		this.courseDeptTextBox = courseDeptTextBox;
	}

	public TextBox getCourseDescriptionTextBox() {
		return courseDescriptionTextBox;
	}

	public void setCourseDescriptionTextBox(TextBox courseDescriptionTextBox) {
		this.courseDescriptionTextBox = courseDescriptionTextBox;
	}

	public TextBox getCourseSectionTextBox() {
		return courseSectionTextBox;
	}

	public void setCourseSectionTextBox(TextBox courseSectionTextBox) {
		this.courseSectionTextBox = courseSectionTextBox;
	}

	public TextBox getCourseSectionTimeIdTextBox() {
		return courseSectionTimeIdTextBox;
	}

	public void setCourseSectionTimeIdTextBox(TextBox courseSectionTimeIdTextBox) {
		this.courseSectionTimeIdTextBox = courseSectionTimeIdTextBox;
	}

	public TextBox getSectionTypeTextBox() {
		return sectionTypeTextBox;
	}

	public void setSectionTypeTextBox(TextBox sectionTypeTextBox) {
		this.sectionTypeTextBox = sectionTypeTextBox;
	}

	public TextBox getStartTimeTextBox() {
		return startTimeTextBox;
	}

	public void setStartTimeTextBox(TextBox startTimeTextBox) {
		this.startTimeTextBox = startTimeTextBox;
	}

	public TextBox getEndTimeTextBox() {
		return endTimeTextBox;
	}

	public void setEndTimeTextBox(TextBox endTimeTextBox) {
		this.endTimeTextBox = endTimeTextBox;
	}

	public TextBox getDayOfWeekTextBox() {
		return dayOfWeekTextBox;
	}

	public void setDayOfWeekTextBox(TextBox dayOfWeekTextBox) {
		this.dayOfWeekTextBox = dayOfWeekTextBox;
	}

	public TextBox getLocationTextBox() {
		return locationTextBox;
	}

	public void setLocationTextBox(TextBox locationTextBox) {
		this.locationTextBox = locationTextBox;
	}

	public TextBox getLocationIdTextBox() {
		return locationIdTextBox;
	}

	public void setLocationIdTextBox(TextBox locationIdTextBox) {
		this.locationIdTextBox = locationIdTextBox;
	}

	public TextBox getBuildingTextBox() {
		return buildingTextBox;
	}

	public void setBuildingTextBox(TextBox buildingTextBox) {
		this.buildingTextBox = buildingTextBox;
	}

	public TextBox getRoomTextBox() {
		return roomTextBox;
	}

	public void setRoomTextBox(TextBox roomTextBox) {
		this.roomTextBox = roomTextBox;
	}

	public TextBox getRoomSizeTextBox() {
		return roomSizeTextBox;
	}

	public void setRoomSizeTextBox(TextBox roomSizeTextBox) {
		this.roomSizeTextBox = roomSizeTextBox;
	}

	public TextBox getDepartmentTextBox() {
		return departmentTextBox;
	}

	public void setDepartmentTextBox(TextBox departmentTextBox) {
		this.departmentTextBox = departmentTextBox;
	}

	public TextBox getDepartmentIdTextBox() {
		return departmentIdTextBox;
	}

	public void setDepartmentIdTextBox(TextBox departmentIdTextBox) {
		this.departmentIdTextBox = departmentIdTextBox;
	}

	public TextBox getTermIdTextBox() {
		return termIdTextBox;
	}

	public void setTermIdTextBox(TextBox termIdTextBox) {
		this.termIdTextBox = termIdTextBox;
	}

	public TextBox getTermNameTextBox() {
		return termNameTextBox;
	}

	public void setTermNameTextBox(TextBox termNameTextBox) {
		this.termNameTextBox = termNameTextBox;
	}

	public TextBox getCourseSectionIdTextBox() {
		return courseSectionIdTextBox;
	}

	public void setCourseSectionIdTextBox(TextBox courseSectionIdTextBox) {
		this.courseSectionIdTextBox = courseSectionIdTextBox;
	}
	
	public TextBox getTermTextBox() {
		return termTextBox;
	}
	public void setTermTextBox(TextBox termTextBox) {
		this.termTextBox = termTextBox;
	}
	
	@Override
	public void setPresenter(BuilderPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	
	/*
	@Override
	public void showErrorMessages(String errorMessages)
	{
		Window.alert(errorMessages);
	}
	*/
	
	public HTMLPanel getBuilderPanel() {
		return builderPanel;
	}

	public void setBuilderPanel(HTMLPanel builderPanel) {
		this.builderPanel = builderPanel;
	}

	public Button getAddCoursesButton() {
		return addCoursesButton;
	}

	public void setAddCoursesButton(Button addCoursesButton) {
		this.addCoursesButton = addCoursesButton;
	}

	public Button getModifyCoursesButton() {
		return modifyCoursesButton;
	}

	public void setModifyCoursesButton(Button modifyCoursesButton) {
		this.modifyCoursesButton = modifyCoursesButton;
	}

	public Button getRemoveCoursesButton() {
		return removeCoursesButton;
	}

	public void setRemoveCoursesButton(Button removeCoursesButton) {
		this.removeCoursesButton = removeCoursesButton;
	}

	public Button getAddSectionsButton() {
		return addSectionsButton;
	}

	public void setAddSectionsButton(Button addSectionsButton) {
		this.addSectionsButton = addSectionsButton;
	}

	public Button getModifySectionsButton() {
		return modifySectionsButton;
	}

	public void setModifySectionsButton(Button modifySectionsButton) {
		this.modifySectionsButton = modifySectionsButton;
	}

	public Button getRemoveSectionsButton() {
		return removeSectionsButton;
	}

	public void setRemoveSectionsButton(Button removeSectionsButton) {
		this.removeSectionsButton = removeSectionsButton;
	}

	public Button getAddCourseSectionTimesButton() {
		return addCourseSectionTimesButton;
	}

	public void setAddCourseSectionTimesButton(Button addCourseSectionTimesButton) {
		this.addCourseSectionTimesButton = addCourseSectionTimesButton;
	}

	public Button getModifyCourseSectionTimesButton() {
		return modifyCourseSectionTimesButton;
	}

	public void setModifyCourseSectionTimesButton(Button modifyCourseSectionTimesButton) {
		this.modifyCourseSectionTimesButton = modifyCourseSectionTimesButton;
	}

	public Button getRemoveCourseSectionTimesButton() {
		return removeCourseSectionTimesButton;
	}

	public void setRemoveCourseSectionTimesButton(Button removeCourseSectionTimesButton) {
		this.removeCourseSectionTimesButton = removeCourseSectionTimesButton;
	}

	public Button getAddLocationsButton() {
		return addLocationsButton;
	}

	public void setAddLocationsButton(Button addLocationsButton) {
		this.addLocationsButton = addLocationsButton;
	}

	public Button getModifyLocationsButton() {
		return modifyLocationsButton;
	}

	public void setModifyLocationsButton(Button modifyLocationsButton) {
		this.modifyLocationsButton = modifyLocationsButton;
	}

	public Button getRemoveLocationsButton() {
		return removeLocationsButton;
	}

	public void setRemoveLocationsButton(Button removeLocationsButton) {
		this.removeLocationsButton = removeLocationsButton;
	}

	public Button getAddDepartmentsButton() {
		return addDepartmentsButton;
	}

	public void setAddDepartmentsButton(Button addDepartmentsButton) {
		this.addDepartmentsButton = addDepartmentsButton;
	}

	public Button getModifyDepartmentsButton() {
		return modifyDepartmentsButton;
	}

	public void setModifyDepartmentsButton(Button modifyDepartmentsButton) {
		this.modifyDepartmentsButton = modifyDepartmentsButton;
	}

	public Button getRemoveDepartmentsButton() {
		return removeDepartmentsButton;
	}

	public void setRemoveDepartmentsButton(Button removeDepartmentsButton) {
		this.removeDepartmentsButton = removeDepartmentsButton;
	}

	public Button getAddTermsButton() {
		return addTermsButton;
	}

	public void setAddTermsButton(Button addTermsButton) {
		this.addTermsButton = addTermsButton;
	}

	public Button getModifyTermsButton() {
		return modifyTermsButton;
	}

	public void setModifyTermsButton(Button modifyTermsButton) {
		this.modifyTermsButton = modifyTermsButton;
	}

	public Button getRemoveTermsButton() {
		return removeTermsButton;
	}

	public void setRemoveTermsButton(Button removeTermsButton) {
		this.removeTermsButton = removeTermsButton;
	}

	public Button getConfirmRequestButton() {
		return confirmRequestButton;
	}

	public void setConfirmRequestButton(Button confirmRequestButton) {
		this.confirmRequestButton = confirmRequestButton;
	}

	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return builderPanel;
	}
	
	
	@UiHandler("addCoursesButton")
	void onAddCoursesButtonClicked(ClickEvent evt) {
		presenter.addCourses();
	}
	
	@UiHandler("modifyCoursesButton")
	void onModifyCoursesButtonClicked(ClickEvent evt) {
		presenter.modifyCourses();
	}
	
	@UiHandler("removeCoursesButton")
	void onremoveCoursesButtonClicked(ClickEvent evt) {
		presenter.removeCourses();
	}
	
	@UiHandler("addSectionsButton")
	void onAddSectionsButtonClicked(ClickEvent evt) {
		presenter.addCourseSections();
	}
	
	@UiHandler("modifySectionsButton")
	void onModifySectionsButtonClicked(ClickEvent evt) {
		presenter.modifyCourseSections();
	}
	
	@UiHandler("removeSectionsButton")
	void onremoveSectionsButtonClicked(ClickEvent evt) {
		presenter.removeCourseSections();
	}
	
	@UiHandler("addCourseSectionTimesButton")
	void onAddCourseSectionTimesButtonClicked(ClickEvent evt) {
		presenter.addCourseSectionTimes();
	}
	
	@UiHandler("modifyCourseSectionTimesButton")
	void onModifyCourseSectionTimesButtonClicked(ClickEvent evt) {
		presenter.modifyCourseSectionTimes();
	}
	
	@UiHandler("removeCourseSectionTimesButton")
	void onremoveCourseSectionTimesButtonClicked(ClickEvent evt) {
		presenter.removeCourseSectionTimes();
	}
	
	@UiHandler("addLocationsButton")
	void onAddLocationsButtonClicked(ClickEvent evt) {
		presenter.addLocations();
	}
	
	@UiHandler("modifyLocationsButton")
	void onModifyLocationsButtonClicked(ClickEvent evt) {
		presenter.modifyLocations();
	}
	
	@UiHandler("removeLocationsButton")
	void onremoveLocationsButtonClicked(ClickEvent evt) {
		presenter.removeLocations();
	}
	
	@UiHandler("addDepartmentsButton")
	void onAddDepartmentsButtonClicked(ClickEvent evt) {
		presenter.addDepartments();
	}
	
	@UiHandler("modifyDepartmentsButton")
	void onModifyDepartmentsButtonClicked(ClickEvent evt) {
		presenter.modifyDepartments();
	}
	
	@UiHandler("removeDepartmentsButton")
	void onremoveDepartmentsButtonClicked(ClickEvent evt) {
		presenter.removeDepartments();
	}
	
	@UiHandler("addTermsButton")
	void onAddTermsButtonClicked(ClickEvent evt) {
		presenter.addTerms();
	}
	
	@UiHandler("removeTermsButton")
	void onremoveTermsButtonClicked(ClickEvent evt) {
		presenter.removeTerms();
	}
	
	@UiHandler("modifyTermsButton")
	void onModifyTermsButtonClicked(ClickEvent evt) {
		presenter.modifyTerms();
	}
	
	@UiHandler("confirmRequestButton")
	void onConfirmRequestButtonClicked(ClickEvent evt) {
		presenter.confirmRequest();
	}
	
	
	
	
	
	@Override
	public void showErrorMessages(String errorMessages)
	{
		Window.alert(errorMessages);
	}

}
