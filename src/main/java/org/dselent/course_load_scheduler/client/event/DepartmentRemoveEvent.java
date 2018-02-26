package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentRemoveEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class DepartmentRemoveEvent extends DisplayEvent<DepartmentRemoveAction,DepartmentRemoveEventHandler>{
	
	public static Type<DepartmentRemoveEventHandler> TYPE = new Type<DepartmentRemoveEventHandler>();
	
	private DepartmentRemoveAction action;
	
	public DepartmentRemoveEvent(DepartmentRemoveAction action, HasWidgets container)
	{
		super(action,container);
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
