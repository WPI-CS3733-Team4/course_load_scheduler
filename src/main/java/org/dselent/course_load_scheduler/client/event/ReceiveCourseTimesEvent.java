package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseTimesAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseTimesEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseTimesEvent extends DisplayEvent<ReceiveCourseTimesAction, ReceiveCourseTimesEventHandler>
{
	public static Type<ReceiveCourseTimesEventHandler> TYPE = new Type<ReceiveCourseTimesEventHandler>();
	
	public ReceiveCourseTimesEvent(ReceiveCourseTimesAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveCourseTimesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCourseTimesEventHandler handler)
	{
		handler.onReceiveCourseTimes(this);
	}
}
