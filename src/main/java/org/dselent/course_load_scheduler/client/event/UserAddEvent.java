package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.UserAddEventHandler;


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

        GWT.log("event dispach Reached");
		handler.onUserAdd(this);
	}
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
