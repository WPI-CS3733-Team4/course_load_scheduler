package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendCoursesEvent;

import com.google.gwt.event.shared.EventHandler;

//Created by Krishna Madhurkar

public interface SendCoursesEventHandler extends EventHandler
{
	  public void onSendCourses(SendCoursesEvent evt);
}
