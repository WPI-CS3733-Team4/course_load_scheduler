package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendUsersEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendUsersEventHandler extends EventHandler
{
	  public void onSendUsers(SendUsersEvent evt);
}
