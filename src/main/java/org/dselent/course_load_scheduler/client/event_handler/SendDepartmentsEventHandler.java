package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendDepartmentsEvent;
import com.google.gwt.event.shared.EventHandler;

/* Created by Thananart Piyajarawong*/

public interface SendDepartmentsEventHandler extends EventHandler{
	public void onSendDepartment(SendDepartmentsEvent evt);
}