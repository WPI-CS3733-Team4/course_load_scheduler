package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseModifyEventHandler extends EventHandler{
	
	public void onCourseModify(CourseModifyEvent evt);

}
