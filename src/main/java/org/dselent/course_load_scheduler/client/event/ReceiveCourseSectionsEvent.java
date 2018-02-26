package org.dselent.course_load_scheduler.client.event;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseSectionsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseSectionsEventHandler;

/* Created by Krishna Madhurkar*/

public class ReceiveCourseSectionsEvent extends DisplayEvent<ReceiveCourseSectionsAction,ReceiveCourseSectionsEventHandler>{

public static Type<ReceiveCourseSectionsEventHandler> TYPE = new Type<ReceiveCourseSectionsEventHandler>();

private ReceiveCourseSectionsAction action;

public ReceiveCourseSectionsEvent(ReceiveCourseSectionsAction action, HasWidgets container)
{
    super(action, container);
    this.action = action;
}

public ReceiveCourseSectionsAction getAction()
{
    return action;
}

/*
 *
 */
@Override
public Type<ReceiveCourseSectionsEventHandler> getAssociatedType()
{
    return TYPE;
}

/*
 *
 */
@Override
protected void dispatch(ReceiveCourseSectionsEventHandler handler)
{
    handler.onReceiveCourseSections(this);
}

}