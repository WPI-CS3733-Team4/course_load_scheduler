package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseDepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseDepartmentRemoveEvent extends DisplayEvent<CourseDepartmentRemoveAction,CourseDepartmentRemoveEventHandler>{
	
	public static Type<CourseDepartmentRemoveEventHandler> TYPE = new Type<CourseDepartmentRemoveEventHandler>();
	
	private CourseDepartmentRemoveAction action;
	
	public CourseDepartmentRemoveEvent(CourseDepartmentRemoveAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public CourseDepartmentRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseDepartmentRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseDepartmentRemoveEventHandler handler)
	{
		handler.onCourseDepartmentRemove(this);
	}

}
