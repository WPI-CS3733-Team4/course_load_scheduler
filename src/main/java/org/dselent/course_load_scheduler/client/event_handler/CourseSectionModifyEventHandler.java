package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionModifyEventHandler extends EventHandler{
	
	public void onCourseSectionModify(CourseSectionModifyEvent evt);

}
