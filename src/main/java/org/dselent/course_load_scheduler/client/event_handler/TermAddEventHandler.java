package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.TermAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface TermAddEventHandler extends EventHandler{
	
	public void onTermAdd(TermAddEvent evt);

}
