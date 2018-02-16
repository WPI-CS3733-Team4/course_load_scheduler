package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UserModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface UserModifyEventHandler extends EventHandler{
	
	public void onUserModify(UserModifyEvent evt);

}
