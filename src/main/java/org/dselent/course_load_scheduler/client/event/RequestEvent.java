package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.RequestAction;
import org.dselent.course_load_scheduler.client.event_handler.RequestEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class RequestEvent extends GwtEvent<RequestEventHandler>{
	
	public static Type<RequestEventHandler> TYPE = new Type<RequestEventHandler>();
	
	private RequestAction action;
	
	public RequestEvent(RequestAction action)
	{
		this.action = action;
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
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
