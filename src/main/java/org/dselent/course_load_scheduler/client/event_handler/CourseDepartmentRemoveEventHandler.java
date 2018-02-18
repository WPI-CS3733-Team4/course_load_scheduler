package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseDepartmentRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseDepartmentRemoveEventHandler extends EventHandler{
	
	public void onCourseDepartmentRemove(CourseDepartmentRemoveEvent evt);

}
