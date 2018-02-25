package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseDepartmentAddAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseDepartmentAddEvent extends DisplayEvent<CourseDepartmentAddAction,CourseDepartmentAddEventHandler>{
	
	public static Type<CourseDepartmentAddEventHandler> TYPE = new Type<CourseDepartmentAddEventHandler>();
	
	private CourseDepartmentAddAction action;
	
	public CourseDepartmentAddEvent(CourseDepartmentAddAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public CourseDepartmentAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseDepartmentAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseDepartmentAddEventHandler handler)
	{
		handler.onCourseDepartmentAdd(this);
	}
	

}
