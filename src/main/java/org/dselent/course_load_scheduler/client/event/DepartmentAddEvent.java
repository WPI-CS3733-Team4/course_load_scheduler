package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DepartmentAddAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentAddEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class DepartmentAddEvent extends DisplayEvent<DepartmentAddAction,DepartmentAddEventHandler>{
	
	public static Type<DepartmentAddEventHandler> TYPE = new Type<DepartmentAddEventHandler>();
	
	private DepartmentAddAction action;
	
	public DepartmentAddEvent(DepartmentAddAction action,HasWidgets container)
	{
		super(action,container);
	}
	
	public DepartmentAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<DepartmentAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(DepartmentAddEventHandler handler)
	{
		handler.onDepartmentAdd(this);
	}
	

}
