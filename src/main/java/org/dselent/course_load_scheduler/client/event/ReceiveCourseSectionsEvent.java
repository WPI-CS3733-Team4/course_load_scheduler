

/* Created by Krishna Madhurkar*/

package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseSectionsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseSectionsEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseSectionsEvent extends DisplayEvent<ReceiveCourseSectionsAction, ReceiveCourseSectionsEventHandler>
{
	public static Type<ReceiveCourseSectionsEventHandler> TYPE = new Type<ReceiveCourseSectionsEventHandler>();
	
	public ReceiveCourseSectionsEvent(ReceiveCourseSectionsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveCourseSectionsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCourseSectionsEventHandler handler)
	{
		handler.onReceiveCourseSections(this);
	}
}
