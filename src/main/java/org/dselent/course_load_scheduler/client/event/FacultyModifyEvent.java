package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.FacultyModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class FacultyModifyEvent extends GwtEvent<FacultyModifyEventHandler>{
	
	public static Type<FacultyModifyEventHandler> TYPE = new Type<FacultyModifyEventHandler>();
	
	private FacultyModifyAction action;
	
	public FacultyModifyEvent(FacultyModifyAction action)
	{
		this.action = action;
	}
	
	public FacultyModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<FacultyModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(FacultyModifyEventHandler handler)
	{
		handler.onFacultyModify(this);
	}

}
