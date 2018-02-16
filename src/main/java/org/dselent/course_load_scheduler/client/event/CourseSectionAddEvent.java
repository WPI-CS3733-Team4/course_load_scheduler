package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseSectionAddEvent extends GwtEvent<CourseSectionAddEventHandler>{
	
	public static Type<CourseSectionAddEventHandler> TYPE = new Type<CourseSectionAddEventHandler>();
	
	private CourseSectionAddAction action;
	
	public CourseSectionAddEvent(CourseSectionAddAction action)
	{
		this.action = action;
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
