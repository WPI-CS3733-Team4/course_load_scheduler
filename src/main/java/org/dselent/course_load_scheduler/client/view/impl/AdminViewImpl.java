package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.AdminView;

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

/* Created by Krishna Madhurkar*/

public class AdminViewImpl extends BaseViewImpl<AdminPresenter> implements AdminView
{
	private static AdminViewImplUiBinder uiBinder = GWT.create(AdminViewImplUiBinder.class);
	
	interface AdminViewImplUiBinder extends UiBinder<Widget, AdminViewImpl>{}
			
	@UiField
	Label viewLabel;
	
	@UiField
	Label userIdLabel;
	
	@UiField
	Label userNameLabel;
	
	@UiField
	Label firstNameLabel;
	
	@UiField
	Label lastNameLabel;
	
	@UiField
	Label emailLabel;
	
	@UiField
	Label addUserLabel;
	
	@UiField
	Label modifyUserLabel;
	
	@UiField
	Label removeUserLabel;
	
	@UiField
	Label changeRoleLabel;
	
	@UiField
	Label passwordLabel;
	
	@UiField
	Label warningLabel;
	
	
	@UiField
	TextBox userIdTextBox;
	
	@UiField
	TextBox userNameTextBox;
	
	@UiField
	TextBox firstNameTextBox;
	
	@UiField
	TextBox lastNameTextBox;
	
	@UiField
	TextBox emailTextBox;
	
	@UiField
	TextBox passwordTextBox;
	
	@UiField
	Button addUserButton;
	
	@UiField
	Button modifyUserButton;
	
	@UiField
	Button removeUserButton;
	
	@UiField
	Button changeRoleButton;
	
	@UiField
	VerticalPanel adminPanel;
	
	public AdminViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public TextBox getUserIdTextBox()
	{
		return userIdTextBox;
	}
	@Override
	public void setUserIdTextBox(TextBox userIdTextBox)
	{
		this.userIdTextBox = userIdTextBox;
	}
	@Override
	public TextBox getUserNameTextBox()
	{
		return userNameTextBox;
	}
	
	@Override
	public void setUserNameTextBox(TextBox userNameTextBox)
	{
		this.userNameTextBox = userNameTextBox;
	}
	
	@Override
	public TextBox getFirstNameTextBox()
	{
		return firstNameTextBox;
	}
	
	@Override
	public void setFirstNameTextBox(TextBox firstNameTextBox)
	{
		this.firstNameTextBox = firstNameTextBox;
	}
	
	@Override 
	public TextBox getLastNameTextBox()
	{
		return lastNameTextBox;
	}
	
	@Override
	public void setLastNameTextBox(TextBox lastNameTextBox)
	{
		this.lastNameTextBox = lastNameTextBox;
	}
	
	@Override
	public TextBox getEmailTextBox()
	{
		return emailTextBox;
	}
	
	@Override
	public void setEmailTextBox(TextBox emailTextBox)
	{
		this.emailTextBox = emailTextBox;
	}

	@Override
	public TextBox getPasswordTextBox()
	{
		return passwordTextBox;
	}

	@Override
	public void setPasswordTextBox(TextBox passwordTextBox)
	{
		this.passwordTextBox = passwordTextBox;
	}
	
	@Override
	public Button getAddUserButton()
	{
		return addUserButton;
	}
	
	@Override
	public Button getModifyUserButton()
	{
		return modifyUserButton;
	}
	
	@Override
	public Button getRemoveUserButton()
	{
		return removeUserButton;
	}

	@Override
	public Button getChangeRoleButton()
	{
		return changeRoleButton;
	}

	
	@Override
	public void setPresenter(AdminPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	@Override
	public void showUserErrorMessages(String userErrorMessages)
	{
		Window.alert(UserErrorMessages);
	}
	@Override
	public void showErrorChangeRoleMessages(String errorChangeRoleMessages)
	{
		Window.alert(ErrorChangeRoleMessages);
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return adminPanel;
	}
	
	@UiHandler("addUserButton")
	void onAddUserButtonClicked(ClickEvent evt)
	{
		presenter.addUser();
	}
	
	@UiHandler("modifyUserButton")
	void onModifyUserButtonClicked(ClickEvent evt)
	{
		presenter.modifyUser();
	}
	
	@UiHandler("removeUserButton")
	void onRemoveUserButtonClicked(ClickEvent evt)
	{
		presenter.modifyUser();
	}
	
	@UiHandler("changeRoleButton")
	void onChangeRoleButtonClicked(ClickEvent evt)
	{
		presenter.changeRole();
	}

}
