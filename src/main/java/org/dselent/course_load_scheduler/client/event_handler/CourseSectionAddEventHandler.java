package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionAddEventHandler extends EventHandler{
	
	public void onCourseSectionAdd(CourseSectionAddEvent evt);

}
