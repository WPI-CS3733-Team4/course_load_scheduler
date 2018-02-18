package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseDepartmentModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseDepartmentModifyEventHandler extends EventHandler{
	
	public void onCourseDepartmentModify(CourseDepartmentModifyEvent evt);

}
