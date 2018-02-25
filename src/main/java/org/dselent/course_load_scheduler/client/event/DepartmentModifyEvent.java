package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class DepartmentModifyEvent extends GwtEvent<DepartmentModifyEventHandler>{
	
	public static Type<DepartmentModifyEventHandler> TYPE = new Type<DepartmentModifyEventHandler>();
	
	private DepartmentModifyAction action;
	
	public DepartmentModifyEvent(DepartmentModifyAction action)
	{
		this.action = action;
	}
	
	public DepartmentModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<DepartmentModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(DepartmentModifyEventHandler handler)
	{
		handler.onDepartmentModify(this);
	}
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
