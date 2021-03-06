package org.dselent.course_load_scheduler.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import org.dselent.course_load_scheduler.client.presenter.BuilderPresenter;

public interface BuilderView extends BaseView<BuilderPresenter>{
	
	TextBox getCourseTextBox();	
	void setCourseTextBox(TextBox courseTextBox);
	TextBox getCourseIdTextBox();
	void setCourseIdTextBox(TextBox courseIdTextBox);
	TextBox getCourseNameTextBox();
	void setCourseNameTextBox(TextBox courseNameTextBox);
	TextBox getCourseDeptTextBox();
	void setCourseDeptTextBox(TextBox courseDeptTextBox);
	TextBox getCourseDescriptionTextBox();
	void setCourseDescriptionTextBox(TextBox courseDescriptionTextBox);
	TextBox getCourseSectionIdTextBox();

    void setCourseSectionIdTextBox(TextBox courseSectionIdTextBox);
	TextBox getCourseSectionTimeIdTextBox();
	void setCourseSectionTimeIdTextBox(TextBox courseSectionTimeId);
	TextBox getSectionTypeTextBox();
	void setSectionTypeTextBox(TextBox sectionTypeTextBox);
	TextBox getStartTimeTextBox();
	void setStartTimeTextBox(TextBox startTimeTextBox);
	TextBox getEndTimeTextBox();
	void setEndTimeTextBox(TextBox endTimeTextBox);
	TextBox getDayOfWeekTextBox();
	void setDayOfWeekTextBox(TextBox dayOfWeekTextBox);
	TextBox getLocationTextBox();
	void setLocationTextBox(TextBox locationTextBox);
	TextBox getLocationIdTextBox();
	void setLocationIdTextBox(TextBox locationIdTextBox);
	TextBox getBuildingTextBox();
	void setBuildingTextBox(TextBox buildingTextBox);
	TextBox getRoomTextBox();
	void setRoomTextBox(TextBox roomTextBox);
	TextBox getRoomSizeTextBox();
	void setRoomSizeTextBox(TextBox roomSizeTextBox);
	TextBox getDepartmentTextBox();
	void setDepartmentTextBox(TextBox departmentTextBox);
	TextBox getDepartmentIdTextBox();
	void setDepartmentIdTextBox(TextBox departmentIdTextBox);
	TextBox getTermIdTextBox();
	void setTermIdTextBox(TextBox termIdTextBox);
	TextBox getTermNameTextBox();
	void setTermNameTextBox(TextBox termNameTextBox);
	
	TextBox getTermTextBox();
	void setTermTextBox(TextBox termTextBox);
	
	Button getAddCoursesButton();
	void setAddCoursesButton(Button addCoursesButton);
	Button getModifyCoursesButton();
	void setModifyCoursesButton(Button modifyCoursesButton);
	Button getRemoveCoursesButton();
	void setRemoveCoursesButton(Button removeCoursesButton);
	Button getAddSectionsButton();
	void setAddSectionsButton(Button addSectionsButton);
	Button getModifySectionsButton();
	void setModifySectionsButton(Button modifySectionsButton);
	Button getRemoveSectionsButton();
	void setRemoveSectionsButton(Button removeSectionsButton);
	Button getAddCourseSectionTimesButton();
	void setAddCourseSectionTimesButton(Button addCourseSectionTimesButton);
	Button getModifyCourseSectionTimesButton();
	void setModifyCourseSectionTimesButton(Button modifyCourseSectionTimesButton);
	Button getRemoveCourseSectionTimesButton();
	void setRemoveCourseSectionTimesButton(Button removeCourseSectionTimesButton);
	Button getAddLocationsButton();
	void setAddLocationsButton(Button addLocationsButton);
	Button getModifyLocationsButton();
	void setModifyLocationsButton(Button modifyLocationsButton);
	Button getRemoveLocationsButton();
	void setRemoveLocationsButton(Button removeLocationsButton);
	Button getAddDepartmentsButton();
	void setAddDepartmentsButton(Button addDepartmentsButton);
	Button getModifyDepartmentsButton();
	void setModifyDepartmentsButton(Button modifyDepartmentsButton);
	Button getRemoveDepartmentsButton();
	void setRemoveDepartmentsButton(Button removeDepartmentsButton);
	Button getAddTermsButton();
	void setAddTermsButton(Button addTermsButton);
	Button getModifyTermsButton();
	void setModifyTermsButton(Button modifyTermsButton);
	Button getRemoveTermsButton();
	void setRemoveTermsButton(Button removeTermsButton);
	Button getConfirmRequestButton();
	void setConfirmRequestButton(Button confirmRequestButton);
	
	void showErrorMessages(String errorMessages);


    TextBox getCourseSectionTextBox();

    void setCourseSectionTextBox(TextBox courseSectionTextBox);
}
