package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveCoursesEvent;

//Created by Krishna Madhurkar

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCoursesEventHandler extends EventHandler
{
	  public void onReceiveCourses(ReceiveCoursesEvent evt);
}
