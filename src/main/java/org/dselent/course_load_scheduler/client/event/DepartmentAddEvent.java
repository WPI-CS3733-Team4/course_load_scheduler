package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DepartmentAddAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class DepartmentAddEvent extends GwtEvent<DepartmentAddEventHandler>{
	
	public static Type<DepartmentAddEventHandler> TYPE = new Type<DepartmentAddEventHandler>();
	
	private DepartmentAddAction action;
	
	public DepartmentAddEvent(DepartmentAddAction action)
	{
		this.action = action;
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
