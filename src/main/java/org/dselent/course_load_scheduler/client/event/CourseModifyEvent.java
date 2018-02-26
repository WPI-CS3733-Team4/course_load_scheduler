package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseModifyEventHandler;


/* Created by Nathan Siegel */

public class CourseModifyEvent extends DisplayEvent<CourseModifyAction,CourseModifyEventHandler>{
	
	public static Type<CourseModifyEventHandler> TYPE = new Type<CourseModifyEventHandler>();
	
	private CourseModifyAction action;
	
	public CourseModifyEvent(CourseModifyAction action, HasWidgets container)
	{
		super(action, container);
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

}
