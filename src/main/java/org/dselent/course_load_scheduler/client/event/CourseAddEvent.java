package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class CourseAddEvent extends GwtEvent<CourseAddEventHandler>{

    public static Type<CourseAddEventHandler> TYPE = new Type<CourseAddEventHandler>();

    private CourseAddAction action;

    public CourseAddEvent(CourseAddAction action)
    {
        this.action = action;
    }

    public CourseAddAction getAction()
    {
        return action;
    }

    /*
     *
     */
    @Override
    public Type<CourseAddEventHandler> getAssociatedType()
    {
        return TYPE;
    }

    /*
     *
     */
    @Override
    protected void dispatch(CourseAddEventHandler handler)
    {
        handler.onCourseAdd(this);
    }

}
