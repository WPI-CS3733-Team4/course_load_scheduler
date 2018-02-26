package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendCourseRequestsEvent;

import com.google.gwt.event.shared.EventHandler;

//Created by Krishna Madhurkar

public interface SendCourseRequestsEventHandler extends EventHandler
{
	  public void onSendCourseRequests(SendCourseRequestsEvent evt);
}
