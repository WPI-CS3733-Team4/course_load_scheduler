package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSectionTimeModifyEventHandler;


/* Created by Nathan Siegel */

public class CourseSectionTimeModifyEvent extends DisplayEvent<CourseSectionTimeModifyAction,CourseSectionTimeModifyEventHandler>{
	
	public static Type<CourseSectionTimeModifyEventHandler> TYPE = new Type<CourseSectionTimeModifyEventHandler>();
	
	private CourseSectionTimeModifyAction action;
	
	public CourseSectionTimeModifyEvent(CourseSectionTimeModifyAction action, HasWidgets container)
	{
        super(action, container);
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
