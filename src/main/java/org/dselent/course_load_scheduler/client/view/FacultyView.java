package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.cellview.client.CellList;

/* Created by Nathan Siegel */

public interface FacultyView extends BaseView<FacultyPresenter>
{
	CellList<String> getCellList();
	void setCellList(CellList<String> cellList);
	TextBox getRequestIdTextBox();
	void setRequestIdTextBox(TextBox requestIdTextBox);
	TextBox getFacultyIdTextBox();
	void setFacultyIdTextBox(TextBox facultyIdTextBox);
	TextBox getCourseSectionIdTextBox();
	void setCourseSectionIdTextBox(TextBox courseSectionIdTextBox);
	
	Button getRequestButton();
	Button getUnrequestButton();
	void showErrorMessages(String errorMessages);
}
