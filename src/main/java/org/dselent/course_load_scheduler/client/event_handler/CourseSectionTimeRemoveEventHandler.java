package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionTimeRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionTimeRemoveEventHandler extends EventHandler{
	
	public void onCourseSectionTimeRemove(CourseSectionTimeRemoveEvent evt);

}
