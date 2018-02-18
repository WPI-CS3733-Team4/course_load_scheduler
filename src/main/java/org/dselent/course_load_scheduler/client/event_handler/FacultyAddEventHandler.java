package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.FacultyAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface FacultyAddEventHandler extends EventHandler{
	
	public void onFacultyAdd(FacultyAddEvent evt);

}
