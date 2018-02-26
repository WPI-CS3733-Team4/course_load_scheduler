package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class CourseSectionModifyEvent extends DisplayEvent<CourseSectionModifyAction,CourseSectionModifyEventHandler>{
	
	public static Type<CourseSectionModifyEventHandler> TYPE = new Type<CourseSectionModifyEventHandler>();
	
	private CourseSectionModifyAction action;
	
	public CourseSectionModifyEvent(CourseSectionModifyAction action, HasWidgets container)
	{
		super(action,container);
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
