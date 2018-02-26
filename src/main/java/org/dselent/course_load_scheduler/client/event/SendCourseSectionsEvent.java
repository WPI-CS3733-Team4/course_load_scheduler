package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendCourseSectionsAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCourseSectionsEventHandler;

/* Created by Krishna Madhurkar*/

public class SendCourseSectionsEvent extends DisplayEvent<SendCourseSectionsAction,SendCourseSectionsEventHandler>{

public static Type<SendCourseSectionsEventHandler> TYPE = new Type<SendCourseSectionsEventHandler>();

private SendCourseSectionsAction action;

public SendCourseSectionsEvent(SendCourseSectionsAction action, HasWidgets container)
{
    super(action, container);
    this.action = action;
}

public SendCourseSectionsAction getAction()
{
    return action;
}

/*
 *
 */
@Override
public Type<SendCourseSectionsEventHandler> getAssociatedType()
{
    return TYPE;
}

/*
 *
 */
@Override
protected void dispatch(SendCourseSectionsEventHandler handler)
{
    handler.onSendCourseSections(this);
}

}