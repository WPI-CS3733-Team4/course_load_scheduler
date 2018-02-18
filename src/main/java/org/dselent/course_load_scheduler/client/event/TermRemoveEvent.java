package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.TermRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.TermRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class TermRemoveEvent extends GwtEvent<TermRemoveEventHandler>{
	
	public static Type<TermRemoveEventHandler> TYPE = new Type<TermRemoveEventHandler>();
	
	private TermRemoveAction action;
	
	public TermRemoveEvent(TermRemoveAction action)
	{
		this.action = action;
	}
	
	public TermRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<TermRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(TermRemoveEventHandler handler)
	{
		handler.onTermRemove(this);
	}

}
