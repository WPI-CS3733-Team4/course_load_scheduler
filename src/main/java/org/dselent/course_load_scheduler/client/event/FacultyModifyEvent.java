package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.FacultyModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyModifyEventHandler;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class FacultyModifyEvent extends DisplayEvent<FacultyModifyAction, FacultyModifyEventHandler>{
	
	public static Type<FacultyModifyEventHandler> TYPE = new Type<FacultyModifyEventHandler>();
	
	private FacultyModifyAction action;
	
	public FacultyModifyEvent(FacultyModifyAction action, HasWidgets container)
	{
        super(action, container);
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
