package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.UserRegisterEventHandler;


/* Created by Nathan Siegel */

public class UserRegisterEvent extends DisplayEvent<UserAddAction,UserRegisterEventHandler>{
	
	public static Type<UserRegisterEventHandler> TYPE = new Type<UserRegisterEventHandler>();
	
	private UserAddAction action;
	
	public UserRegisterEvent(UserAddAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public UserAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<UserRegisterEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(UserRegisterEventHandler handler)
	{
		handler.onUserRegister(this);
	}

}
