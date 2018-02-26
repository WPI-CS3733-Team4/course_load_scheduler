package org.dselent.course_load_scheduler.client.presenter.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;
import org.dselent.course_load_scheduler.client.action.*;
import org.dselent.course_load_scheduler.client.errorstring.InvalidUserRoleStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidUserStrings;
import org.dselent.course_load_scheduler.client.event.*;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminView;

import java.util.ArrayList;
import java.util.List;

/* Created by Krishna Mddhurkar */

public class AdminPresenterImpl extends BasePresenterImpl implements AdminPresenter
{
	private IndexPresenter parentPresenter;
	private AdminView view;
	private boolean addUserClickInProgress;
	private boolean modifyUserClickInProgress;
	private boolean removeUserClickInProgress;
	private boolean changeRoleClickInProgress;

	@Inject
	public AdminPresenterImpl(IndexPresenter parentPresenter, AdminView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		addUserClickInProgress = false;
		modifyUserClickInProgress = false;
		removeUserClickInProgress = false;
		changeRoleClickInProgress = false;
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
	public AdminView getView()
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
	public void addUser()
	{
		if(!addUserClickInProgress)
		{
			addUserClickInProgress = true;
			view.getAddUserButton().setEnabled(false);
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
				invalidReasonList.add(InvalidUserStrings.NULL_USER_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(firstName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidUserStrings.NULL_FIRST_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(lastName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidUserStrings.NULL_LAST_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				checkEmptyString(email);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidUserStrings.NULL_EMAIL);
				fieldsAreValid = false;
			}

			try
			{
				checkEmptyString(password);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidUserStrings.NULL_PASSWORD);
				fieldsAreValid = false;
			}
			
			if(fieldsAreValid)
			{
				addUser(userName, firstName, lastName, email, password);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	private void addUser(String userName, String firstName, String lastName, String email, String password)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		UserAddAction sla = new UserAddAction(userName, firstName, lastName, email, password);
		UserAddEvent sle = new UserAddEvent(sla, container);
		eventBus.fireEvent(sle);
	}
	


	@Override
	public void modifyUser()
	{
		if(!modifyUserClickInProgress) {
            modifyUserClickInProgress = true;
            view.getModifyUserButton().setEnabled(false);
            parentPresenter.showLoadScreen();

            Integer userId = null;

            String userName = view.getUserNameTextBox().getText();
            String firstName = view.getFirstNameTextBox().getText();
            String lastName = view.getLastNameTextBox().getText();
            String email = view.getEmailTextBox().getText();
            String password = view.getPasswordTextBox().getText();

            boolean fieldsAreValid = true;

            List<String> invalidReasonList = new ArrayList<>();

            try {
                userId = Integer.parseInt(view.getUserIdTextBox().getText());

            } catch(NumberFormatException e) {
                invalidReasonList.add(InvalidUserStrings.INVALID_USER_ID);
                fieldsAreValid = false;
            }
            try {
                checkEmptyString(userName);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserStrings.NULL_USER_NAME);
                fieldsAreValid = false;
            }

            try {
                checkEmptyString(firstName);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserStrings.NULL_FIRST_NAME);
                fieldsAreValid = false;
            }

            try {
                checkEmptyString(lastName);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserStrings.NULL_LAST_NAME);
                fieldsAreValid = false;
            }

            try {
                checkEmptyString(email);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserStrings.NULL_EMAIL);
                fieldsAreValid = false;
            }

            try {
                checkEmptyString(password);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserStrings.NULL_PASSWORD);
                fieldsAreValid = false;
            }

            if(fieldsAreValid) {
                sendModifyUser(userId, userName, firstName, lastName, email, password);
            } else {
                InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
                InvalidFieldEvent ile = new InvalidFieldEvent(ila);
                eventBus.fireEvent(ile);
            }
        } else {
            getParentPresenter().hideLoadScreen();
        }
	}
	
	private void sendModifyUser(Integer userId, String userName, String firstName, String lastName, String email, String password)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		UserModifyAction sla = new UserModifyAction(userId, userName, firstName, lastName, email, password);
		UserModifyEvent sle = new UserModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
		
	}

	@Override
	public void removeUser()
	{
		if(!removeUserClickInProgress) {
            removeUserClickInProgress = true;
            view.getAddUserButton().setEnabled(false);
            parentPresenter.showLoadScreen();

            Integer userId = null;


            boolean fieldsAreValid = true;

            List<String> invalidReasonList = new ArrayList<>();
            try {
                userId = Integer.parseInt(view.getUserIdTextBox().getText());

            } catch(NumberFormatException e) {
                invalidReasonList.add(InvalidUserStrings.INVALID_USER_ID);
                fieldsAreValid = false;
            }


            if(fieldsAreValid) {
                sendRemoveUser(userId);
            } else {
                InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
                InvalidFieldEvent ile = new InvalidFieldEvent(ila);
                eventBus.fireEvent(ile);
            }
        } else {
            getParentPresenter().hideLoadScreen();
        }
	}
	
	private void sendRemoveUser(Integer userId)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		UserRemoveAction sla = new UserRemoveAction(userId);
		UserRemoveEvent sle = new UserRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void changeRole()
	{
		if(!changeRoleClickInProgress) {
            changeRoleClickInProgress = true;
            view.getChangeRoleButton().setEnabled(false);
            parentPresenter.showLoadScreen();

            Integer userId = null;
            Integer userRoleId = null;

            String role = view.getRoleTextBox().getText();

            boolean fieldsAreValid = true;

            List<String> invalidReasonList = new ArrayList<>();

            try {
                userRoleId = Integer.parseInt(view.getUserRoleIdTextBox().getText());

            } catch(NumberFormatException e) {
                invalidReasonList.add(InvalidUserRoleStrings.INVALID_USER_ROLE_ID);
                fieldsAreValid = false;
            }

            try {
                userId = Integer.parseInt(view.getUserTextBox().getText());
            } catch(NumberFormatException e) {
                invalidReasonList.add(InvalidUserRoleStrings.INVALID_USER_ID);
                fieldsAreValid = false;
            }

            try {
                checkEmptyString(role);
            } catch(EmptyStringException e) {
                invalidReasonList.add(InvalidUserRoleStrings.NULL_ROLE);
                fieldsAreValid = false;
            }
            if(fieldsAreValid) {
                sendChangeRole(userRoleId, userId, role);
            } else {
                InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
                InvalidFieldEvent ile = new InvalidFieldEvent(ila);
                eventBus.fireEvent(ile);
            }
        } else {
            getParentPresenter().hideLoadScreen();
        }
	}
	
	private void sendChangeRole(Integer userRoleId, Integer userId, String changeRole)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		ChangeRoleAction sla = new ChangeRoleAction(userRoleId, userId, changeRole);
		ChangeRoleEvent sle = new ChangeRoleEvent(sla,container);
		eventBus.fireEvent(sle);
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
		view.getAddUserButton().setEnabled(true);
		view.getModifyUserButton().setEnabled(true);
		view.getRemoveUserButton().setEnabled(true);
		view.getChangeRoleButton().setEnabled(true);
		addUserClickInProgress = false;
		modifyUserClickInProgress = false;
		removeUserClickInProgress = false;
		changeRoleClickInProgress = false;
		
		InvalidFieldAction ila = evt.getAction();
		GWT.log(ila.toString());
//		view.showErrorMessages(ila.toString());
	}
}
// end
