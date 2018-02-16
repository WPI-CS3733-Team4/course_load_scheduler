package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface BuilderView {
	TextBox getCourseTextBox();
	void setCourseTextBox(TextBox courseTextBox);
	TextBox getSectionTextBox();
	void setSectionTextBox(TextBox sectionTextBox);
	TextBox getTimeTextBox();
	void setTimeTextBox(TextBox timeTextBox);
	TextBox getLocationTextBox();
	void setLocationTextBox(TextBox locationTextBox);
	TextBox getDepartmentTextBox();
	void setDepartmentTextBox(TextBox departmentTextBox);
	TextBox getTermTextBox();
	void setTermTextBox(TextBox termTextBox);
	Button getEnterButton();
	void setEnterButton(Button enterButton);
	

}
