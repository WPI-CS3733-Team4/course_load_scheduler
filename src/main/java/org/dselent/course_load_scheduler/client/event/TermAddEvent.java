package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.TermAddAction;
import org.dselent.course_load_scheduler.client.event_handler.TermAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class TermAddEvent extends GwtEvent<TermAddEventHandler>{
	
	public static Type<TermAddEventHandler> TYPE = new Type<TermAddEventHandler>();
	
	private TermAddAction action;
	
	public TermAddEvent(TermAddAction action)
	{
		this.action = action;
	}
	
	public TermAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<TermAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(TermAddEventHandler handler)
	{
		handler.onTermAdd(this);
	}

}
