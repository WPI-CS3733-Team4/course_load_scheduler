package org.dselent.course_load_scheduler.client.event;

// Created by Krishna Madhurkar

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendCourseRequestsAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCourseRequestsEventHandler;

public class SendCourseRequestsEvent extends DisplayEvent<SendCourseRequestsAction, SendCourseRequestsEventHandler>
{
	public static Type<SendCourseRequestsEventHandler> TYPE = new Type<SendCourseRequestsEventHandler>();
	
	private SendCourseRequestsAction action;
	
	public SendCourseRequestsEvent(SendCourseRequestsAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendCourseRequestsAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendCourseRequestsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendCourseRequestsEventHandler handler)
	{
		handler.onSendCourseRequests(this);
	}

	
}
