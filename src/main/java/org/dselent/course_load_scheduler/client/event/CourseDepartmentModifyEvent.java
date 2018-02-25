package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseDepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseDepartmentModifyEvent extends DisplayEvent<CourseDepartmentModifyAction,CourseDepartmentModifyEventHandler>{
	
	public static Type<CourseDepartmentModifyEventHandler> TYPE = new Type<CourseDepartmentModifyEventHandler>();
	
	private CourseDepartmentModifyAction action;
	
	public CourseDepartmentModifyEvent(CourseDepartmentModifyAction action, HasWidgets container)
	{
		super(action,container);
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
