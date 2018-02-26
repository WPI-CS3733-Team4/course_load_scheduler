package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeRemoveEventHandler;


/* Created by Nathan Siegel */

public class CourseSectionTimeRemoveEvent extends DisplayEvent<CourseSectionTimeRemoveAction,CourseSectionTimeRemoveEventHandler>{
	
	public static Type<CourseSectionTimeRemoveEventHandler> TYPE = new Type<CourseSectionTimeRemoveEventHandler>();
	
	private CourseSectionTimeRemoveAction action;
	
	public CourseSectionTimeRemoveEvent(CourseSectionTimeRemoveAction action, HasWidgets container)
	{
        super(action, container);
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
