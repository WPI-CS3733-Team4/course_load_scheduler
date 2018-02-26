package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseDepartmentAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseDepartmentAddEventHandler;


/* Created by Nathan Siegel */

public class CourseDepartmentAddEvent extends DisplayEvent<CourseDepartmentAddAction,CourseDepartmentAddEventHandler>{
	
	public static Type<CourseDepartmentAddEventHandler> TYPE = new Type<CourseDepartmentAddEventHandler>();
	
	private CourseDepartmentAddAction action;
	
	public CourseDepartmentAddEvent(CourseDepartmentAddAction action, HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public CourseDepartmentAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseDepartmentAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseDepartmentAddEventHandler handler)
	{
		handler.onCourseDepartmentAdd(this);
	}
	

}
