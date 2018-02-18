package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseDepartmentModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseDepartmentModifyEvent extends GwtEvent<CourseDepartmentModifyEventHandler>{
	
	public static Type<CourseDepartmentModifyEventHandler> TYPE = new Type<CourseDepartmentModifyEventHandler>();
	
	private CourseDepartmentModifyAction action;
	
	public CourseDepartmentModifyEvent(CourseDepartmentModifyAction action)
	{
		this.action = action;
	}
	
	public CourseDepartmentModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseDepartmentModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseDepartmentModifyEventHandler handler)
	{
		handler.onCourseDepartmentModify(this);
	}

}
