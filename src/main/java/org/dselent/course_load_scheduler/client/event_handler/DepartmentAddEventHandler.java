package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DepartmentAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface DepartmentAddEventHandler extends EventHandler{
	
	public void onDepartmentAdd(DepartmentAddEvent evt);

}
