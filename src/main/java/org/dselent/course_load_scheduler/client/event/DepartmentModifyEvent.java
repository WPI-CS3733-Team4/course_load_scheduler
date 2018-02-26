package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.DepartmentModifyEventHandler;


/* Created by Nathan Siegel */

public class DepartmentModifyEvent extends DisplayEvent<DepartmentModifyAction,DepartmentModifyEventHandler>{
	
	public static Type<DepartmentModifyEventHandler> TYPE = new Type<DepartmentModifyEventHandler>();
	
	private DepartmentModifyAction action;
	
	public DepartmentModifyEvent(DepartmentModifyAction action, HasWidgets container)
	{
        super(action, container);
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

}
