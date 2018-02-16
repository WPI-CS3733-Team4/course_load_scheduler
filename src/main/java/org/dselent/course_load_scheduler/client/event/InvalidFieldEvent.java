package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidFieldEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidFieldEvent extends GwtEvent<InvalidFieldEventHandler>
{
	public static Type<InvalidFieldEventHandler> TYPE = new Type<InvalidFieldEventHandler>();
	
	private InvalidFieldAction action;
	
	public InvalidFieldEvent(InvalidFieldAction action)
	{
		this.action = action;
	}
	
	public InvalidFieldAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidFieldEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidFieldEventHandler handler)
	{
		handler.onInvalidLogin(this);
	}
}
