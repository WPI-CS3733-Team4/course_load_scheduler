package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendUsersAction;
import org.dselent.course_load_scheduler.client.event_handler.SendUsersEventHandler;

public class SendUsersEvent extends DisplayEvent<SendUsersAction, SendUsersEventHandler>
{
	public static Type<SendUsersEventHandler> TYPE = new Type<SendUsersEventHandler>();
	
	private SendUsersAction action;
	
	public SendUsersEvent(SendUsersAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendUsersAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendUsersEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendUsersEventHandler handler)
	{
		handler.onSendUsers(this);
	}

	
}
