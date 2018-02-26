package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendLocationsEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendLocationsEventHandler extends EventHandler
{
	  public void onSendLocations(SendLocationsEvent evt);
}
