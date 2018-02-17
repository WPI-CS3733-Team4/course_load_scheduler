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
	Label idLabel;
	
	@UiField
	Label userNameLabel;
	
	@UiField
	Label firstNameLabel;
	
	@UiField
	Label lastNameLabel;
	
	@UiField
	Label emailLabel;
	
	@UiField
	Label addAdminLabel;
	
	@UiField
	Label modifyAdminLabel;
	
	@UiField
	Label removeAdminLabel;
	
	@UiField
	Label addRoleLabel;
	
	@UiField
	Label modifyRoleLabel;
	
	@UiField
	Label removeRoleLabel;
	
	@UiField
	Label passwordLabel;
	
	@UiField
	Label warningLabel;
	
	
	@UiField
	TextBox idTextBox;
	
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
	TextBox addAdminTextBox;
	
	@UiField
	TextBox modifyAdminTextBox;
	
	@UiField
	TextBox removeAdminTextBox;
	
	@UiField
	TextBox addRoleTextBox;
	
	@UiField
	TextBox modifyRoleTextBox;
	
	@UiField
	TextBox removeRoleTextBox;
	
	@UiField
	Button addAdminButton;
	
	@UiField
	Button modifyAdminButton;
	
	@UiField
	Button removeAdminButton;
	
	@UiField
	Button addRoleButton;
	
	@UiField
	Button modifyRoleButton;
	
	@UiField
	Button removeRoleButton;
	
	@UiField
	VerticalPanel adimPanel;
	
	public AdminViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public TextBox getidBox()
	{
		return userNameTextBox;
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
	public TextBox getAddAdminTextBox()
	{
		return addAdminTextBox;
	}
	@Override
	public void setAddAdminTextBox(TextBox addAdminTextBox)
	{
		this.addAdminTextBox = addAdminTextBox;
	} 
	
	
	@Override
	public TextBox getModifyAdminTextBox()
	{
		return modifyAdminTextBox;
		
	
	@Override
	public void setModifyAdminTextBox(TextBox modifyAdminTextBox)
	{
		this.modifyAdminTextBox = modifyAdminTextBox;
	}
	
	@Override
	public TextBox getRemoveAdminTextBox()
	{
		return removeAdminTextBox;
	}

	@Override
	public void setRemoveAdminTextBox(TextBox removeAdminTextBox)
	{
		this.removeAdminTextBox = removeAdminTextBox;
	}
	
	@Override
	public TextBox getAddRoleTextBox()
	{
		return addRoleTextBox;
	}

	@Override
	public void setaddRoleTextBox(TextBox addRoleTextBox)
	{
		this.addRoleTextBox = addRoleTextBox;
	}
	
	@Override
	public TextBox getModifyRoleTextBox()
	{
		return modifyRoleTextBox;
	}

	@Override
	public void setModifyRoleTextBox(TextBox modifyRoleTextBox)
	{
		this.modifyRoleTextBox = modifyRoleTextBox;
	}
	
	@Override
	public TextBox getRemoveRoleTextBox()
	{
		return removeRoleTextBox;
	}

	@Override
	public void setRemoveRoleTextBox(TextBoxremoveRoleTextBox)
	{
		this.TextBoxremoveRoleTextBox = TextBoxremoveRoleTextBox;
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
		return registerPanel;
	}
	
	@UiHandler("registerButton")
	void onloginButtonClicked(ClickEvent evt)
	{
		presenter.register();
	}

}
