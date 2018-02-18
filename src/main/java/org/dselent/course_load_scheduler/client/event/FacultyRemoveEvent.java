package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class FacultyRemoveEvent extends GwtEvent<FacultyRemoveEventHandler>{
	
	public static Type<FacultyRemoveEventHandler> TYPE = new Type<FacultyRemoveEventHandler>();
	
	private FacultyRemoveAction action;
	
	public FacultyRemoveEvent(FacultyRemoveAction action)
	{
		this.action = action;
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
