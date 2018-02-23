package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import com.google.gwt.event.shared.EventHandler;

public interface InvalidLoginEventHandler extends EventHandler{
	
	public void onInvalidLogin(InvalidLoginEvent evt);

}
