package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.UserModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.UserModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class UserModifyEvent extends GwtEvent<UserModifyEventHandler>{
	
	public static Type<UserModifyEventHandler> TYPE = new Type<UserModifyEventHandler>();
	
	private UserModifyAction action;
	
	public UserModifyEvent(UserModifyAction action)
	{
		this.action = action;
	}
	
	public UserModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<UserModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(UserModifyEventHandler handler)
	{
		handler.onUserModify(this);
	}

}
