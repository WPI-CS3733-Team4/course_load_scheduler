package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.RegisterPresenter;
import org.dselent.course_load_scheduler.client.view.RegisterView;

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


public class RegisterViewImpl extends BaseViewImpl<RegisterPresenter> implements RegisterView
{
	private static RegisterViewImplUiBinder uiBinder = GWT.create(RegisterViewImplUiBinder.class);
	
	interface RegisterViewImplUiBinder extends UiBinder<Widget, RegisterViewImpl>{}
			
	@UiField
	Label viewLabel;
	
	@UiField
	Label userNameLabel;
	
	@UiField
	Label firstNameLabel;
	
	@UiField
	Label lastNameLabel;
	
	@UiField
	Label emailLabel;
	
	@UiField
	Label passwordLabel;
	
	@UiField
	Label warningLabel;
	
	
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
	Button registerButton;
	
	@UiField
	VerticalPanel registerPanel;
	
	public RegisterViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
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
	public Button getRegisterButton()
	{
		return registerButton;
	}

	@Override
	public void setPresenter(RegisterPresenter presenter)
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
		return registerPanel;
	}
	
	@UiHandler("registerButton")
	void onloginButtonClicked(ClickEvent evt)
	{
		presenter.register();
	}

}
