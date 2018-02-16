package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSectionTimeModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface CourseSectionTimeModifyEventHandler extends EventHandler{
	
	public void onCourseSectionTimeModify(CourseSectionTimeModifyEvent evt);

}
