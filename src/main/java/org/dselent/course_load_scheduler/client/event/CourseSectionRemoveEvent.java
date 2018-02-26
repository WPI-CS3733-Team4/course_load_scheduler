package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionRemoveEventHandler;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class CourseSectionRemoveEvent extends DisplayEvent<CourseSectionRemoveAction, CourseSectionRemoveEventHandler>{
	
	public static Type<CourseSectionRemoveEventHandler> TYPE = new Type<CourseSectionRemoveEventHandler>();
	
	private CourseSectionRemoveAction action;
	
	public CourseSectionRemoveEvent(CourseSectionRemoveAction action, HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public CourseSectionRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseSectionRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseSectionRemoveEventHandler handler)
	{
		handler.onCourseSectionRemove(this);
	}
	
	
}
