package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentRemoveEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class DepartmentRemoveEvent extends GwtEvent<DepartmentRemoveEventHandler>{
	
	public static Type<DepartmentRemoveEventHandler> TYPE = new Type<DepartmentRemoveEventHandler>();
	
	private DepartmentRemoveAction action;
	
	public DepartmentRemoveEvent(DepartmentRemoveAction action)
	{
		this.action = action;
	}
	
	public DepartmentRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<DepartmentRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(DepartmentRemoveEventHandler handler)
	{
		handler.onDepartmentRemove(this);
	}

}
