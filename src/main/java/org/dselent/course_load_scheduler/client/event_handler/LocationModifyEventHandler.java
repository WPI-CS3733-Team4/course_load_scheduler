package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.LocationModifyEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface LocationModifyEventHandler extends EventHandler{
	
	public void onLocationModify(LocationModifyEvent evt);

}
