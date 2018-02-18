package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionTimeRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseSectionTimeRemoveEvent extends GwtEvent<CourseSectionTimeRemoveEventHandler>{
	
	public static Type<CourseSectionTimeRemoveEventHandler> TYPE = new Type<CourseSectionTimeRemoveEventHandler>();
	
	private CourseSectionTimeRemoveAction action;
	
	public CourseSectionTimeRemoveEvent(CourseSectionTimeRemoveAction action)
	{
		this.action = action;
	}
	
	public CourseSectionTimeRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionTimeRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionTimeRemoveEventHandler handler)
	{
		handler.onCourseSectionTimeRemove(this);
	}

}
