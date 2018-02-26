package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveUserRolesAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveUserRolesEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveUserRolesEvent extends DisplayEvent<ReceiveUserRolesAction, ReceiveUserRolesEventHandler>
{
	public static Type<ReceiveUserRolesEventHandler> TYPE = new Type<ReceiveUserRolesEventHandler>();
	
	public ReceiveUserRolesEvent(ReceiveUserRolesAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveUserRolesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveUserRolesEventHandler handler)
	{
		handler.onReceiveUserRoles(this);
	}
}
