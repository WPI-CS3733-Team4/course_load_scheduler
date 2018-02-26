
package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendCourseSectionsEvent;
import com.google.gwt.event.shared.EventHandler;

/* Created by Krishna Madhurkar*/

public interface SendCourseSectionsEventHandler extends EventHandler{
	
	public void onSendCourseSections(SendCourseSectionsEvent evt);

}
