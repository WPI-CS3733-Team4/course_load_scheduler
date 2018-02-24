package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.UserAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class UserAddEvent extends GwtEvent<UserAddEventHandler>{
	
	public static Type<UserAddEventHandler> TYPE = new Type<UserAddEventHandler>();
	
	private UserAddAction action;
	
	public UserAddEvent(UserAddAction action)
	{
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
		handler.onUserAdd(this);
	}
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
