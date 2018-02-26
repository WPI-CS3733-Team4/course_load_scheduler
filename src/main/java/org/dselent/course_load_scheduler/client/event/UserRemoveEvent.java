package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UserRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.UserRemoveEventHandler;


/* Created by Nathan Siegel */

public class UserRemoveEvent extends DisplayEvent<UserRemoveAction,UserRemoveEventHandler>{
	
	public static Type<UserRemoveEventHandler> TYPE = new Type<UserRemoveEventHandler>();
	
	private UserRemoveAction action;
	
	public UserRemoveEvent(UserRemoveAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public UserRemoveAction getAction()
	{
		return action;
	}

	@Override
	public Type<UserRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}


	@Override
	protected void dispatch(UserRemoveEventHandler handler)
	{
		handler.onUserRemove(this);
	}
}
