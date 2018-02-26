package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendDepartmentEvent;
import com.google.gwt.event.shared.EventHandler;

/* Created by Thananart Piyajarawong*/

public interface SendDepartmentEventHandler extends EventHandler{
	public void onSendDepartment(SendDepartmentEvent evt);
}