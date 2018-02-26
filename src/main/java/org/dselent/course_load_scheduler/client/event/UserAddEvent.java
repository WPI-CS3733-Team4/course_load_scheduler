package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.UserAddEventHandler;


/* Created by Nathan Siegel */

public class UserAddEvent extends DisplayEvent<UserAddAction,UserAddEventHandler>{
	
	public static Type<UserAddEventHandler> TYPE = new Type<UserAddEventHandler>();
	
	private UserAddAction action;
	
	public UserAddEvent(UserAddAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;

	}
	
	public UserAddAction getAction()
	{
		return this.action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<UserAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(UserAddEventHandler handler)
	{

        GWT.log("event dispach Reached");
		handler.onUserAdd(this);
	}

}
