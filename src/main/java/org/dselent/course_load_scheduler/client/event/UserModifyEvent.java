package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UserModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.UserModifyEventHandler;


/* Created by Nathan Siegel */

public class UserModifyEvent extends DisplayEvent<UserModifyAction,UserModifyEventHandler>{
	
	public static Type<UserModifyEventHandler> TYPE = new Type<UserModifyEventHandler>();
	
	private UserModifyAction action;
	
	public UserModifyEvent(UserModifyAction action, HasWidgets container)
	{
		super(action, container);
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
