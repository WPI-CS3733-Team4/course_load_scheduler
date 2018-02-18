package org.dselent.course_load_scheduler.client.event_handler;

import com.google.gwt.event.shared.EventHandler;
import org.dselent.course_load_scheduler.client.event.SendLogoutEvent;

public interface SendLogoutEventHandler extends EventHandler {
    public void onSendLogout(SendLogoutEvent evt);
}
