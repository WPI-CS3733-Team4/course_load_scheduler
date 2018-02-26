package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveLocationsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveLocationsEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveLocationsEvent extends DisplayEvent<ReceiveLocationsAction, ReceiveLocationsEventHandler>
{
	public static Type<ReceiveLocationsEventHandler> TYPE = new Type<ReceiveLocationsEventHandler>();
	
	public ReceiveLocationsEvent(ReceiveLocationsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveLocationsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveLocationsEventHandler handler)
	{
		handler.onReceiveLocations(this);
	}
}
