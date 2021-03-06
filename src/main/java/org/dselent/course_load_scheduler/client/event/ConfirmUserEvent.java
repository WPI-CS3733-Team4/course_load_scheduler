package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ConfirmUserAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.ConfirmUserEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class ConfirmUserEvent extends DisplayEvent<ConfirmUserAction,ConfirmUserEventHandler>{

    public static Type<ConfirmUserEventHandler> TYPE = new Type<ConfirmUserEventHandler>();

    private ConfirmUserAction action;

    public ConfirmUserEvent(ConfirmUserAction action, HasWidgets container)
    {
        super(action, container);
    }

    public ConfirmUserAction getAction()
    {
        return action;
    }

    /*
     *
     */
    @Override
    public Type<ConfirmUserEventHandler> getAssociatedType()
    {
        return TYPE;
    }

    /*
     *
     */
    @Override
    protected void dispatch(ConfirmUserEventHandler handler)
    {
        handler.onConfirmUser(this);
    }

}
