package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.LocationRemoveEvent;

import com.google.gwt.event.shared.EventHandler;

/* Created by Nathan Siegel */

public interface LocationRemoveEventHandler extends EventHandler{
	
	public void onLocationRemove(LocationRemoveEvent evt);

}
