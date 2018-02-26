package org.dselent.course_load_scheduler.client.event;

//Created by Krishna Madhurkar

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCoursesEventHandler;

public class SendCoursesEvent extends DisplayEvent<SendCoursesAction, SendCoursesEventHandler>
{
	public static Type<SendCoursesEventHandler> TYPE = new Type<SendCoursesEventHandler>();
	
	private SendCoursesAction action;
	
	public SendCoursesEvent(SendCoursesAction action,HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendCoursesAction getAction()
	{
		return action;
	}
	

	@Override
	public Type<SendCoursesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendCoursesEventHandler handler)
	{
		handler.onSendCourses(this);
	}

	
}
