package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UserRegisterEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface UserRegisterEventHandler extends EventHandler{
	
	public void onUserRegister(UserRegisterEvent evt);

}
