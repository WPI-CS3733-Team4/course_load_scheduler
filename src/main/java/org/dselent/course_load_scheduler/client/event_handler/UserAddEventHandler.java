package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UserAddEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface UserAddEventHandler extends EventHandler{
	
	public void onUserAdd(UserAddEvent evt);

}
