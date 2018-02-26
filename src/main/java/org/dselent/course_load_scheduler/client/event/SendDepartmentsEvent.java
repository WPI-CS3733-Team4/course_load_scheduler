package org.dselent.course_load_scheduler.client.event;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendDepartmentsAction;
import org.dselent.course_load_scheduler.client.event_handler.SendDepartmentsEventHandler;

/* Created by Thananart Piyajarawong*/

public class SendDepartmentsEvent extends DisplayEvent<SendDepartmentsAction,SendDepartmentsEventHandler>{
	public static Type<SendDepartmentsEventHandler> TYPE = new Type<SendDepartmentsEventHandler>();
	
	private SendDepartmentsAction action;
	
	public SendDepartmentsEvent(SendDepartmentsAction action, HasWidgets container)
	{
		super(action,container);
	}
	
	public SendDepartmentsAction getAction()
	{
		return action;
	}
	
	@Override
	public Type <SendDepartmentsEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	
	@Override
	protected void dispatch(SendDepartmentsEventHandler handler)
	{
		handler.onSendDepartments(this);
	}
}
