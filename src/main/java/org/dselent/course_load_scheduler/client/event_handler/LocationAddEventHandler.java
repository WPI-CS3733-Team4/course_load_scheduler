package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.LocationAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface LocationAddEventHandler extends EventHandler{
	
	public void onLocationAdd(LocationAddEvent evt);

}
