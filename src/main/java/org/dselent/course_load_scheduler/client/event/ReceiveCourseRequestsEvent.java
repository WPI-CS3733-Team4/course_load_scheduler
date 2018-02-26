package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseRequestsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseRequestsEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseRequestsEvent extends DisplayEvent<ReceiveCourseRequestsAction, ReceiveCourseRequestsEventHandler>
{
	public static Type<ReceiveCourseRequestsEventHandler> TYPE = new Type<ReceiveCourseRequestsEventHandler>();
	
	public ReceiveCourseRequestsEvent(ReceiveCourseRequestsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveCourseRequestsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCourseRequestsEventHandler handler)
	{
		handler.onReceiveCourseRequests(this);
	}
}
