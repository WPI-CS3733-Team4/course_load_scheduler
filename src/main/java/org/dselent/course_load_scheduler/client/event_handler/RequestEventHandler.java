package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.RequestEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface RequestEventHandler extends EventHandler{
	
	public void onRequest(RequestEvent evt);

}
