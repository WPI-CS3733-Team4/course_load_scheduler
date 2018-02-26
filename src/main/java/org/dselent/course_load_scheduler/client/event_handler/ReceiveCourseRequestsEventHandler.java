package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseRequestsEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCourseRequestsEventHandler extends EventHandler
{
	  public void onReceiveCourseRequests(ReceiveCourseRequestsEvent evt);
}
