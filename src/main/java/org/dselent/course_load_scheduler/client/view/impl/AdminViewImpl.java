package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.view.AdminView;

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

/* Created by Krishna Madhurkar*/

public class AdminViewImpl extends BaseViewImpl<AdminPresenter> implements AdminView
{
	private static AdminViewImplUiBinder uiBinder = GWT.create(AdminViewImplUiBinder.class);
	
	interface AdminViewImplUiBinder extends UiBinder<Widget, AdminViewImpl>{}
			
	//User
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
	
	//UserRole
	
	@UiField
	TextBox userRoleIdTextBox;
	
	@UiField
	TextBox userTextBox;
	
	@UiField
	TextBox roleTextBox;
	
	@UiField
	Button changeRoleButton;
	
	@UiField
	FlexTable userTable;
	
	@UiField
	FlexTable userRoleTable;
	
	@UiField
	HTMLPanel adminPanel;
	
	public AdminViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
		
		userTable.setBorderWidth(2);
		userTable.setText(0, 0, "User Id:");
		userTable.setText(0, 1, "User Name:");
		userTable.setText(0, 2, "First Name:");
		userTable.setText(0, 3, "Last Name:");
		userTable.setText(0, 4, "Email:");
		userTable.setText(0, 5, "Password:");
		userTable.setText(0, 6, "Salt:");
		
		userRoleTable.setBorderWidth(2);
		userRoleTable.setText(0, 0, "Role Id:");
		userRoleTable.setText(0, 1, "User Id:");
		userRoleTable.setText(0, 2, "Role:");
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
	public TextBox getUserRoleIdTextBox() {
		return userRoleIdTextBox;
	}
	@Override
	public void setUserRoleIdTextBox(TextBox userRoleIdTextBox) {
		this.userRoleIdTextBox = userRoleIdTextBox;
	}
	@Override
	public TextBox getUserTextBox() {
		return userTextBox;
	}
	@Override
	public void setUserTextBox(TextBox userTextBox) {
		this.userTextBox = userTextBox;
	}
	@Override
	public TextBox getRoleTextBox() {
		return roleTextBox;
	}
	@Override
	public void setRoleTextBox(TextBox roleTextBox) {
		this.roleTextBox = roleTextBox;
	}
	@Override
	public FlexTable getUserTable(){
		return userTable;
	}
	@Override
	public void setUserTable(FlexTable userTable) {
		this.userTable = userTable;
	}
	@Override
	public FlexTable getUserRoleTable() {
		return userRoleTable;
	}
	@Override
	public void setUserRoleTable(FlexTable userRoleTable) {
		this.userRoleTable = userRoleTable;
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
