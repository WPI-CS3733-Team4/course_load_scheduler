package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class CourseAddEvent extends DisplayEvent<CourseAddAction,CourseAddEventHandler>{

    public static Type<CourseAddEventHandler> TYPE = new Type<CourseAddEventHandler>();

    private CourseAddAction action;

    public CourseAddEvent(CourseAddAction action, HasWidgets container)
    {
        super(action,container);
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
