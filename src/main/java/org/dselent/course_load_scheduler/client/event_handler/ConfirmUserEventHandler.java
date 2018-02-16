package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ConfirmUserEvent;


import com.google.gwt.event.shared.EventHandler;

public interface ConfirmUserEventHandler extends EventHandler
{
    public void onConfirmUser(ConfirmUserEvent evt);
}
