package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveUserRolesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveUserRolesEventHandler extends EventHandler
{
	  public void onReceiveUserRoles(ReceiveUserRolesEvent evt);
}
