package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseTimesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCourseTimesEventHandler extends EventHandler
{
	  public void onReceiveCourseTimes(ReceiveCourseTimesEvent evt);
}
