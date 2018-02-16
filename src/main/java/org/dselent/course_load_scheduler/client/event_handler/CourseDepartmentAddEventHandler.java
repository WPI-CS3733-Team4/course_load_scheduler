package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.CourseDepartmentAddEvent;


import com.google.gwt.event.shared.EventHandler;

public interface CourseDepartmentAddEventHandler extends EventHandler
{
    public void onCourseDepartmentAdd(CourseDepartmentAddEvent evt);
}
