package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionTimeAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionTimeAddEventHandler extends EventHandler{
	
	public void onCourseSectionTimeAdd(CourseSectionTimeAddEvent evt);

}
