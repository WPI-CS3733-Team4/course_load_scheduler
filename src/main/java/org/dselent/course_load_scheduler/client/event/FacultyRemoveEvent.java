package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class FacultyRemoveEvent extends DisplayEvent<FacultyRemoveAction, FacultyRemoveEventHandler>{
	
	public static Type<FacultyRemoveEventHandler> TYPE = new Type<FacultyRemoveEventHandler>();
	
	private FacultyRemoveAction action;
	
	public FacultyRemoveEvent(FacultyRemoveAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public FacultyRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<FacultyRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(FacultyRemoveEventHandler handler)
	{
		handler.onFacultyRemove(this);
	}
	

}
