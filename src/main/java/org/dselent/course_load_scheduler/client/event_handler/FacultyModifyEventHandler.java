package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.FacultyModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface FacultyModifyEventHandler extends EventHandler{
	
	public void onFacultyModify(FacultyModifyEvent evt);

}
