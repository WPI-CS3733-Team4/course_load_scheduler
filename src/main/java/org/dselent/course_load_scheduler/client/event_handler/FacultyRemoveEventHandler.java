package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.FacultyRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface FacultyRemoveEventHandler extends EventHandler{
	
	public void onFacultyRemove(FacultyRemoveEvent evt);

}
