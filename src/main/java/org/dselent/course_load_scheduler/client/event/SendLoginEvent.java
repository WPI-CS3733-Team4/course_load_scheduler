package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.event_handler.SendLoginEventHandler;

public class SendLoginEvent extends DisplayEvent<SendLoginAction, SendLoginEventHandler>
{
	public static Type<SendLoginEventHandler> TYPE = new Type<SendLoginEventHandler>();
	
	private SendLoginAction action;
	
	public SendLoginEvent(SendLoginAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendLoginAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendLoginEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendLoginEventHandler handler)
	{
		handler.onSendLogin(this);
	}

	
}
