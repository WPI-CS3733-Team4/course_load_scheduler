package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendLocationsAction;
import org.dselent.course_load_scheduler.client.event_handler.SendLocationsEventHandler;

public class SendLocationsEvent extends DisplayEvent<SendLocationsAction, SendLocationsEventHandler>
{
	public static Type<SendLocationsEventHandler> TYPE = new Type<SendLocationsEventHandler>();
	
	private SendLocationsAction action;
	
	public SendLocationsEvent(SendLocationsAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendLocationsAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendLocationsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendLocationsEventHandler handler)
	{
		handler.onSendLocations(this);
	}

	
}
