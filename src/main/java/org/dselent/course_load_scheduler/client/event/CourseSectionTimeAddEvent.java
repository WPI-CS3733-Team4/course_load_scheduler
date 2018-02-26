package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeAddEventHandler;


/* Created by Nathan Siegel */

public class CourseSectionTimeAddEvent extends DisplayEvent<CourseSectionTimeAddAction,CourseSectionTimeAddEventHandler>{
	
	public static Type<CourseSectionTimeAddEventHandler> TYPE = new Type<CourseSectionTimeAddEventHandler>();
	
	private CourseSectionTimeAddAction action;
	
	public CourseSectionTimeAddEvent(CourseSectionTimeAddAction action, HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public CourseSectionTimeAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionTimeAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionTimeAddEventHandler handler)
	{
		handler.onCourseSectionTimeAdd(this);
	}

}
