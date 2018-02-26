package org.dselent.course_load_scheduler.client.event;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendDepartmentAction;
import org.dselent.course_load_scheduler.client.event_handler.SendDepartmentEventHandler;

/* Created by Thananart Piyajarawong*/

public class SendDepartmentEvent extends DisplayEvent<SendDepartmentAction,SendDepartmentEventHandler>{
	public static Type<SendDepartmentEventHandler> TYPE = new Type<SendDepartmentEventHandler>();
	
	private SendDepartmentAction action;
	
	public SendDepartmentEvent(SendDepartmentAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public SendDepartmentAction getAction()
	{
		return action;
	}
	
	@Override
	public Type <SendDepartmentEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	
	@Override
	protected void dispatch(SendDepartmentEventHandler handler)
	{
		handler.onSendDepartment(this);
	}
}
