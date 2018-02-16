package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.TermModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface TermModifyEventHandler extends EventHandler{
	
	public void onTermModify(TermModifyEvent evt);

}
