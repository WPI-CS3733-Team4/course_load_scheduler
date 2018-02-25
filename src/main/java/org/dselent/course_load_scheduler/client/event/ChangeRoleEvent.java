	package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ChangeRoleAction;
import org.dselent.course_load_scheduler.client.event_handler.ChangeRoleEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class ChangeRoleEvent extends DisplayEvent<ChangeRoleAction,ChangeRoleEventHandler>{

    public static Type<ChangeRoleEventHandler> TYPE = new Type<ChangeRoleEventHandler>();

    private ChangeRoleAction action;

    public ChangeRoleEvent(ChangeRoleAction action, HasWidgets container)
    {
        super(action,container);
    }

    public ChangeRoleAction getAction()
    {
        return action;
    }

    /*
     *
     */
    @Override
    public Type<ChangeRoleEventHandler> getAssociatedType()
    {
        return TYPE;
    }

    /*
     *
     */
    @Override
    protected void dispatch(ChangeRoleEventHandler handler)
    {
        handler.onChangeRole(this);
    }

}
