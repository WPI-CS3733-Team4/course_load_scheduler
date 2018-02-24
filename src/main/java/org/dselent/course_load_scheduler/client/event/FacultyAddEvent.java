package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class FacultyAddEvent extends GwtEvent<FacultyAddEventHandler>{
	
	public static Type<FacultyAddEventHandler> TYPE = new Type<FacultyAddEventHandler>();
	
	private FacultyAddAction action;
	
	public FacultyAddEvent(FacultyAddAction action)
	{
		this.action = action;
	}
	
	public FacultyAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<FacultyAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(FacultyAddEventHandler handler)
	{
		handler.onFacultyAdd(this);
	}
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
