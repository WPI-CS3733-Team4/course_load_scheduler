package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseSectionModifyEvent extends GwtEvent<CourseSectionModifyEventHandler>{
	
	public static Type<CourseSectionModifyEventHandler> TYPE = new Type<CourseSectionModifyEventHandler>();
	
	private CourseSectionModifyAction action;
	
	public CourseSectionModifyEvent(CourseSectionModifyAction action)
	{
		this.action = action;
	}
	
	public CourseSectionModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionModifyEventHandler handler)
	{
		handler.onCourseSectionModify(this);
	}

}
