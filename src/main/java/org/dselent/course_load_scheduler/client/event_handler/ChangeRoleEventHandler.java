package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ChangeRoleEvent;


import com.google.gwt.event.shared.EventHandler;

public interface ChangeRoleEventHandler extends EventHandler
{
    public void onChangeRole(ChangeRoleEvent evt);
}
