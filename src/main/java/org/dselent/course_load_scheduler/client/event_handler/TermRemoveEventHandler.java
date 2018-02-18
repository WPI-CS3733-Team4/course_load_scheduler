package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.TermRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface TermRemoveEventHandler extends EventHandler{
	
	public void onTermRemove(TermRemoveEvent evt);

}
