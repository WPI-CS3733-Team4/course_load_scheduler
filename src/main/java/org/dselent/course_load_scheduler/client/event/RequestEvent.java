package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.RequestAction;
import org.dselent.course_load_scheduler.client.event_handler.RequestEventHandler;
import org.dselent.course_load_scheduler.client.event_handler.SendLoginEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class RequestEvent extends DisplayEvent<RequestAction,RequestEventHandler>{
	
	public static Type<RequestEventHandler> TYPE = new Type<RequestEventHandler>();
	
	private RequestAction action;
	
	public RequestEvent(RequestAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public RequestAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<RequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(RequestEventHandler handler)
	{
		handler.onRequest(this);
	}

}
