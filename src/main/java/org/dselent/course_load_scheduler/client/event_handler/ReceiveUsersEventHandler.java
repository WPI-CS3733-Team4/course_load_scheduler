package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveUsersEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveUsersEventHandler extends EventHandler
{
	  public void onReceiveUsers(ReceiveUsersEvent evt);
}
