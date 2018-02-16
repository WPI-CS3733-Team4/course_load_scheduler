package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseRemoveEvent extends GwtEvent<CourseRemoveEventHandler>{
	
	public static Type<CourseRemoveEventHandler> TYPE = new Type<CourseRemoveEventHandler>();
	
	private CourseRemoveAction action;
	
	public CourseRemoveEvent(CourseRemoveAction action)
	{
		this.action = action;
	}
	
	public CourseRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseRemoveEventHandler handler)
	{
		handler.onCourseRemove(this);
	}

}
