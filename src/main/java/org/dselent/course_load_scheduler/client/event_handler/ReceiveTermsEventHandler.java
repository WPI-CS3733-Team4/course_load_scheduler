package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveTermsEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Krishna Madhurkar */

public interface ReceiveTermsEventHandler extends EventHandler{
	
	public void onReceiveTerms(ReceiveTermsEvent evt);

}
