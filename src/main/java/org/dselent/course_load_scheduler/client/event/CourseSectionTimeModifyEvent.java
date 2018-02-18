package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionTimeModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseSectionTimeModifyEvent extends GwtEvent<CourseSectionTimeModifyEventHandler>{
	
	public static Type<CourseSectionTimeModifyEventHandler> TYPE = new Type<CourseSectionTimeModifyEventHandler>();
	
	private CourseSectionTimeModifyAction action;
	
	public CourseSectionTimeModifyEvent(CourseSectionTimeModifyAction action)
	{
		this.action = action;
	}
	
	public CourseSectionTimeModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionTimeModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionTimeModifyEventHandler handler)
	{
		handler.onCourseSectionTimeModify(this);
	}

}
