package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.TermRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.TermRemoveEventHandler;


/* Created by Nathan Siegel */

public class TermRemoveEvent extends DisplayEvent<TermRemoveAction,TermRemoveEventHandler>{
	
	public static Type<TermRemoveEventHandler> TYPE = new Type<TermRemoveEventHandler>();
	
	private TermRemoveAction action;
	
	public TermRemoveEvent(TermRemoveAction action, HasWidgets container)
	{
		super(action, container);
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
