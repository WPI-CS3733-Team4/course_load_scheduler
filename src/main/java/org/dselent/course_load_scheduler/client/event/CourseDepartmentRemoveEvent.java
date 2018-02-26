package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseDepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentRemoveEventHandler;


/* Created by Nathan Siegel */

public class CourseDepartmentRemoveEvent extends DisplayEvent<CourseDepartmentRemoveAction,CourseDepartmentRemoveEventHandler>{
	
	public static Type<CourseDepartmentRemoveEventHandler> TYPE = new Type<CourseDepartmentRemoveEventHandler>();
	
	private CourseDepartmentRemoveAction action;
	
	public CourseDepartmentRemoveEvent(CourseDepartmentRemoveAction action, HasWidgets container)
	{
		super(action, container);
        this.action = action;
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
