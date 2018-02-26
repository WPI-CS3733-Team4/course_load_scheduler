
package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCourseSectionsEvent;
import com.google.gwt.event.shared.EventHandler;

/* Created by Krishna Madhurkar*/

public interface ReceiveCourseSectionsEventHandler extends EventHandler{
	
	public void onReceiveCourseSections(ReceiveCourseSectionsEvent evt);

}
