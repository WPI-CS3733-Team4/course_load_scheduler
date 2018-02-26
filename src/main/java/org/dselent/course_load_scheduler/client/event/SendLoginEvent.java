package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.event_handler.SendLoginEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

/* Modified by Krishna Madhurkar */

public class SendLoginEvent extends DisplayEvent<SendLoginAction, SendLoginEventHandler>
{
	public static Type<SendLoginEventHandler> TYPE = new Type<SendLoginEventHandler>();
	
	private SendLoginAction action;
	
	public SendLoginEvent(SendLoginAction action,HasWidgets container)
	{
		super(action,container);
	}
	
	public SendLoginAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<SendLoginEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(SendLoginEventHandler handler)
	{
		handler.onSendLogin(this);
	}

	

}
