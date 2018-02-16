package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.$$Action;
import org.dselent.course_load_scheduler.client.event_handler.$$EventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class $$Event extends GwtEvent<$$EventHandler>{
	
	public static Type<$$EventHandler> TYPE = new Type<$$EventHandler>();
	
	private $$Action action;
	
	public $$Event($$Action action)
	{
		this.action = action;
	}
	
	public $$Action getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<$$EventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch($$EventHandler handler)
	{
		handler.on$$(this);
	}

}
