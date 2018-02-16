package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event.UserAddEvent;
import org.dselent.course_load_scheduler.client.event.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.errorstring.InvalidFieldStrings;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.RegisterPresenter;
import org.dselent.course_load_scheduler.client.view.RegisterView;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;


public class RegisterPresenterImpl extends BasePresenterImpl implements RegisterPresenter
{
	private IndexPresenter parentPresenter;
	private RegisterView view;
	private boolean registerClickInProgress;

	@Inject
	public RegisterPresenterImpl(IndexPresenter parentPresenter, RegisterView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		registerClickInProgress = false;
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
		
		registration = eventBus.addHandler(InvalidRegisterEvent.TYPE, this);
		eventBusRegistration.put(InvalidRegisterEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public RegisterView getView()
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
	public void register()
	{
		if(!registerClickInProgress)
		{
			registerClickInProgress = true;
			view.getRegisterButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			String userName = view.getUserNameTextBox().getText();
			String firstName = view.getFirstNameTextBox().getText();
			String lastName = view.getLastNameTextBox().getText();
			String email = view.getEmailTextBox().getText();
			String password = view.getPasswordTextBox().getText();
			
			boolean fieldsAreValid = true;

			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(userName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidRegisterStrings.NULL_USER_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(firstName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidRegisterStrings.NULL_FIRST_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(lastName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidRegisterStrings.NULL_LAST_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(email);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidRegisterStrings.NULL_EMAIL);
				fieldsAreValid = false;
			}

			try
			{
				checkEmptyString(password);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidRegisterStrings.NULL_PASSWORD);
				fieldsAreValid = false;
			}
			
			if(fieldsAreValid)
			{
				register(userName, firstName, lastName, email, password);
			}
			else
			{
				InvalidRegisterAction ila = new InvalidRegisterAction(invalidReasonList);
				InvalidRegisterEvent ile = new InvalidRegisterEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	private void register(String userName, String firstName, String lastName, String email, String password)
	{
		UserAddAction sla = new UserAddAction(userName, firstName, lastName, email, password);
		UserAddEvent sle = new UserAddEvent(sla);
		eventBus.fireEvent(sle);
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
	public void onInvalidLogin(InvalidRegisterEvent evt)
	{
		parentPresenter.hideLoadScreen();
		view.getRegisterButton().setEnabled(true);
		registerClickInProgress = false;
		
		InvalidRegisterAction ila = evt.getAction();
		view.showErrorMessages(ila.toString());
	}
}
