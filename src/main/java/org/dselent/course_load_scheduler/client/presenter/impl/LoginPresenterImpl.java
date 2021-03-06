package org.dselent.course_load_scheduler.client.presenter.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidLoginStrings;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.view.LoginView;

import java.util.ArrayList;
import java.util.List;


public class LoginPresenterImpl extends BasePresenterImpl implements LoginPresenter
{
	private IndexPresenter parentPresenter;
	private LoginView view;
	private boolean loginClickInProgress;

	@Inject
	public LoginPresenterImpl(IndexPresenter parentPresenter, LoginView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		loginClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidFieldEvent.TYPE, this);
		eventBusRegistration.put(InvalidFieldEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public LoginView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}
	
	@Override
	public void login()
	{
		if(!loginClickInProgress) {
			loginClickInProgress = true;
			view.getLoginButton().setEnabled(false);
			parentPresenter.showLoadScreen();

			String userName = view.getNameTextBox().getText();
			String password = view.getPasswordTextBox().getText();

			boolean validUserName = true;
			boolean validPassword = true;

			List<String> invalidReasonList = new ArrayList<>();

			try {
				validateLoginUserName(userName);
			} catch(EmptyStringException e) {
				invalidReasonList.add(InvalidLoginStrings.NULL_USER_NAME);
				validUserName = false;
			}

			try {
				validateLoginPassword(password);
			} catch(EmptyStringException e) {
				invalidReasonList.add(InvalidLoginStrings.NULL_PASSWORD);
				validPassword = false;
			}

			if(validUserName && validPassword) {
				sendLogin(userName, password);
			} else {
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		} else {
			getParentPresenter().hideLoadScreen();
		}
	}
	
	private void sendLogin(String userName, String password)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SendLoginAction sla = new SendLoginAction(userName, password);
		SendLoginEvent sle = new SendLoginEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	private void validateLoginUserName(String userName) throws EmptyStringException
	{
		checkEmptyString(userName);
	}
	
	private void validateLoginPassword(String password) throws EmptyStringException
	{
		checkEmptyString(password);
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}
	
	/*
	 * Currently only sent by itself
	 * Probably did not need the event bus for this
	 * Useful for example purposes without involving server-side
	*/
	@Override
	public void onInvalidField(InvalidFieldEvent evt)
	{
		parentPresenter.hideLoadScreen();
		view.getLoginButton().setEnabled(true);
		loginClickInProgress = false;
		
		InvalidFieldAction ila = evt.getAction();
        GWT.log(ila.toString());
//		view.showErrorMessages(ila.toString());
	}
}
