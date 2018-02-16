package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UnrequestEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface UnrequestEventHandler extends EventHandler{
	
	public void onUnrequest(UnrequestEvent evt);

}
