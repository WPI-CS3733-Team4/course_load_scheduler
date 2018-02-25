package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionTimeAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseSectionTimeAddEvent extends GwtEvent<CourseSectionTimeAddEventHandler>{
	
	public static Type<CourseSectionTimeAddEventHandler> TYPE = new Type<CourseSectionTimeAddEventHandler>();
	
	private CourseSectionTimeAddAction action;
	
	public CourseSectionTimeAddEvent(CourseSectionTimeAddAction action)
	{
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
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
