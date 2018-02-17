package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface BuilderView {
	TextBox getCourseIdTextBox();
	void setCourseIdTextBox(TextBox courseIdTextBox);
	TextBox getCourseNameTextBox();
	void setCourseNameTextBox(TextBox courseNameTextBox);
	TextBox getCourseDeptTextBox();
	void setCourseDeptTextBox(TextBox courseDeptTextBox);
	TextBox getCourseDescriptionTextBox();
	void setCourseDescriptionTextBox(TextBox courseDescriptionTextBox);
	TextBox getCourseSectionIdTextBox();
	void setCourseSectionIdTextBox(TextBox coureSectionTextBox);
	TextBox getSectionTypeTextBox();
	void getCourseSectionTimeIdTextBox();
	TextBox setCourseSectionTimeIdTextBox(TextBox courseSectionTimeid);
	void setSectionTypeTextBox(TextBox sectionTypeTextox);
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
	TextBox setBuildingTextBox();
	void getBuildingTextBox(TextBox buildingTextBox);
	TextBox getRoomTextBox();
	void setRoomTextBox(TextBox roomTextBox);
	TextBox getRoomSizeTextBox();
	void setRoomSizeTextBox(TextBox roomSizeTextBox);
	TextBox getDepartmentTextBox();
	void setDepartmentTextBox(TextBox departmentTextBox);
	TextBox getDepartmentIdTextBox();
	void setDepartmentIdTextbox(TextBox departmentIdTextBox);
	TextBox getTermIdTextBox();
	void setTermIdTextBox(TextBox termIdTextBox);
	TextBox getTermNameTextBox();
	void setTermNameTextBox(TextBox termNameTextBox);
	Button getEnterButton();
	void setEnterButton(Button enterButton);
	

}
