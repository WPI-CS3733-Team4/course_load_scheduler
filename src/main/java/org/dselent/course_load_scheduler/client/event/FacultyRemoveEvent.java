package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyRemoveEventHandler;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class FacultyRemoveEvent extends DisplayEvent<FacultyRemoveAction, FacultyRemoveEventHandler>{
	
	public static Type<FacultyRemoveEventHandler> TYPE = new Type<FacultyRemoveEventHandler>();
	
	private FacultyRemoveAction action;
	
	public FacultyRemoveEvent(FacultyRemoveAction action, HasWidgets container)
	{
		super(action, container);
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
