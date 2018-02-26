package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class CourseSectionAddEvent extends DisplayEvent<CourseSectionAddAction,CourseSectionAddEventHandler>{
	
	public static Type<CourseSectionAddEventHandler> TYPE = new Type<CourseSectionAddEventHandler>();
	
	private CourseSectionAddAction action;
	
	public CourseSectionAddEvent(CourseSectionAddAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public CourseSectionAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionAddEventHandler handler)
	{
		handler.onCourseSectionAdd(this);
	}
	
	

}
