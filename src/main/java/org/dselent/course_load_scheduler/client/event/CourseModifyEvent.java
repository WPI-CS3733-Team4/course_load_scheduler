package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseModifyEvent extends GwtEvent<CourseModifyEventHandler>{
	
	public static Type<CourseModifyEventHandler> TYPE = new Type<CourseModifyEventHandler>();
	
	private CourseModifyAction action;
	
	public CourseModifyEvent(CourseModifyAction action)
	{
		this.action = action;
	}
	
	public CourseModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseModifyEventHandler handler)
	{
		handler.onCourseModify(this);
	}
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
