package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendCourseTimesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendCourseTimesEventHandler extends EventHandler
{
	  public void onSendCourseTimes(SendCourseTimesEvent evt);
}
