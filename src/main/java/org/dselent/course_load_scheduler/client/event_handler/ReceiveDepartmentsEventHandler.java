package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveDepartmentsEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ReceiveDepartmentsEventHandler extends EventHandler {
	 public void onReceiveDepartments(ReceiveDepartmentsEvent evt);
}
