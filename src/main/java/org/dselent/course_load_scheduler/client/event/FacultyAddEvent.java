package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyAddEventHandler;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class FacultyAddEvent extends DisplayEvent<FacultyAddAction, FacultyAddEventHandler>{
	
	public static Type<FacultyAddEventHandler> TYPE = new Type<FacultyAddEventHandler>();
	
	private FacultyAddAction action;
	
	public FacultyAddEvent(FacultyAddAction action, HasWidgets container)
	{

		super(action, container);
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
	

}
