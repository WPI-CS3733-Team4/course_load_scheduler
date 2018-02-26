package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseAddEventHandler;


/* Created by Nathan Siegel */

public class CourseAddEvent extends DisplayEvent<CourseAddAction,CourseAddEventHandler>{

    public static Type<CourseAddEventHandler> TYPE = new Type<CourseAddEventHandler>();

    private CourseAddAction action;

    public CourseAddEvent(CourseAddAction action, HasWidgets container)
    {
        super(action, container);
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
