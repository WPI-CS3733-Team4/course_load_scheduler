package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendCourseTimesAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCourseTimesEventHandler;

public class SendCourseTimesEvent extends DisplayEvent<SendCourseTimesAction, SendCourseTimesEventHandler>
{
	public static Type<SendCourseTimesEventHandler> TYPE = new Type<SendCourseTimesEventHandler>();
	
	private SendCourseTimesAction action;
	
	public SendCourseTimesEvent(SendCourseTimesAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendCourseTimesAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendCourseTimesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendCourseTimesEventHandler handler)
	{
		handler.onSendCourseTimes(this);
	}

	
}
