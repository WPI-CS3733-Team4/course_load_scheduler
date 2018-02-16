package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DepartmentModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface DepartmentModifyEventHandler extends EventHandler{
	
	public void onDepartmentModify(DepartmentModifyEvent evt);

}
