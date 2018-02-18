package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseRemoveEventHandler extends EventHandler{
	
	public void onCourseRemove(CourseRemoveEvent evt);

}
