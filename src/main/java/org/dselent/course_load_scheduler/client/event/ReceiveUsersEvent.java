package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveUsersAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveUsersEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveUsersEvent extends DisplayEvent<ReceiveUsersAction, ReceiveUsersEventHandler>
{
	public static Type<ReceiveUsersEventHandler> TYPE = new Type<ReceiveUsersEventHandler>();
	
	public ReceiveUsersEvent(ReceiveUsersAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveUsersEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveUsersEventHandler handler)
	{
		handler.onReceiveUsers(this);
	}
}
