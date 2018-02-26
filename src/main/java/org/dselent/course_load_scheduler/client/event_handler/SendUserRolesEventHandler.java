package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendUserRolesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendUserRolesEventHandler extends EventHandler
{
	  public void onSendUserRoles(SendUserRolesEvent evt);
}
