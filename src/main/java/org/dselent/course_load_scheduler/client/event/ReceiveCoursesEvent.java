package org.dselent.course_load_scheduler.client.event;


//Created by Krishna Madhurkar


import org.dselent.course_load_scheduler.client.action.ReceiveCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCoursesEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCoursesEvent extends DisplayEvent<ReceiveCoursesAction, ReceiveCoursesEventHandler>
{
	public static Type<ReceiveCoursesEventHandler> TYPE = new Type<ReceiveCoursesEventHandler>();
	
	public ReceiveCoursesEvent(ReceiveCoursesAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveCoursesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCoursesEventHandler handler)
	{
		handler.onReceiveCourses(this);
	}
}
