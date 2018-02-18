package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UserRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface UserRemoveEventHandler extends EventHandler{
	
	public void onUserRemove(UserRemoveEvent evt);

}
