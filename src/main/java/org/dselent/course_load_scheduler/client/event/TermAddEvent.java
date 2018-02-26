package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.TermAddAction;
import org.dselent.course_load_scheduler.client.event_handler.TermAddEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class TermAddEvent extends DisplayEvent<TermAddAction,TermAddEventHandler>{
	
	public static Type<TermAddEventHandler> TYPE = new Type<TermAddEventHandler>();
	
	private TermAddAction action;
	
	public TermAddEvent(TermAddAction action, HasWidgets container)
	{
		super(action,container);
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
