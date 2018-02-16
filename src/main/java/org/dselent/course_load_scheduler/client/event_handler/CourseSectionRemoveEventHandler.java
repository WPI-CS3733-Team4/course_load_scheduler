package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionRemoveEventHandler extends EventHandler{
	
	public void onCourseSectionRemove(CourseSectionRemoveEvent evt);

}
