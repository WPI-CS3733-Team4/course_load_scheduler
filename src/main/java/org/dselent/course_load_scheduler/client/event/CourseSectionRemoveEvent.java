package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseSectionRemoveEvent extends GwtEvent<CourseSectionRemoveEventHandler>{
	
	public static Type<CourseSectionRemoveEventHandler> TYPE = new Type<CourseSectionRemoveEventHandler>();
	
	private CourseSectionRemoveAction action;
	
	public CourseSectionRemoveEvent(CourseSectionRemoveAction action)
	{
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
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
