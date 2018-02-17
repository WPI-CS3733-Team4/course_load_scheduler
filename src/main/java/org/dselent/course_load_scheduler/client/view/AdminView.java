package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.RegisterPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

/* Created by Krishna Madhurkar */

public interface AdminView extends BaseView<AdminPresenter>
{
	TextBox getidTextBox();
	void setidTextBox(TextBox idTextBox);
	TextBox getUserNameTextBox();
	void setUserNameTextBox(TextBox userNameTextBox);
	TextBox getFirstNameTextBox();
	void setFirstNameTextBox(TextBox firstNameTextBox);
	TextBox getLastNameTextBox();
	void setLastNameTextBox(TextBox lastNameTextBox);
	TextBox getEmailTextBox();
	void setEmailTextBox(TextBox emailTextBox);
	TextBox getPasswordTextBox();
	void setPasswordTextBox(TextBox passwordTextBox);
	Button getaddAdminButton();
	void showErrorAddingAdminMessages(String addAdminErrorMessages);
	Button getModifyAdminButton();
	void showErrorModifyingAdminMessages(String ModifyAdminErrorMessages);
	Button getRemoveAdminButton();
	void showErrorRemovingAdminMessages(String RemoveAdminErrorMessages);
	Button getaddRoleButton();
	void showErrorAddingRoleMessages(String addRoleErrorMessages);
	Button getModifyRoleButton();
	void showErrorModifyingRoleMessages(String ModifyRoleErrorMessages);
	Button getRemoveRoleButton();
	void showErrorRemovingRoleMessages(String RemoveRoleErrorMessages);
}
