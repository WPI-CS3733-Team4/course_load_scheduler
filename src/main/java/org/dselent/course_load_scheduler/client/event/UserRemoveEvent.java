package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.UserRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.UserRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class UserRemoveEvent extends GwtEvent<UserRemoveEventHandler>{
	
	public static Type<UserRemoveEventHandler> TYPE = new Type<UserRemoveEventHandler>();
	
	private UserRemoveAction action;
	
	public UserRemoveEvent(UserRemoveAction action)
	{
		this.action = action;
	}
	
	public UserRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<UserRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(UserRemoveEventHandler handler)
	{
		handler.onUserRemove(this);
	}

}
