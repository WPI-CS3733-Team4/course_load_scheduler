package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DepartmentRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface DepartmentRemoveEventHandler extends EventHandler{
	
	public void onDepartmentRemove(DepartmentRemoveEvent evt);

}
