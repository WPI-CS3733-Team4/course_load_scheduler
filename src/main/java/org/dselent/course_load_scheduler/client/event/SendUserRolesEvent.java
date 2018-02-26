package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendUserRolesAction;
import org.dselent.course_load_scheduler.client.event_handler.SendUserRolesEventHandler;

public class SendUserRolesEvent extends DisplayEvent<SendUserRolesAction, SendUserRolesEventHandler>
{
	public static Type<SendUserRolesEventHandler> TYPE = new Type<SendUserRolesEventHandler>();
	
	private SendUserRolesAction action;
	
	public SendUserRolesEvent(SendUserRolesAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendUserRolesAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendUserRolesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendUserRolesEventHandler handler)
	{
		handler.onSendUserRoles(this);
	}

	
}
