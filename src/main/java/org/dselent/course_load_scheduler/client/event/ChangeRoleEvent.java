package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ChangeRoleAction;
import org.dselent.course_load_scheduler.client.event_handler.ChangeRoleEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class ChangeRoleEvent extends GwtEvent<ChangeRoleEventHandler>{

    public static Type<ChangeRoleEventHandler> TYPE = new Type<ChangeRoleEventHandler>();

    private ChangeRoleAction action;

    public ChangeRoleEvent(ChangeRoleAction action)
    {
        this.action = action;
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
    
    public HasWidgets getContainer() {
		return this.getContainer();
	}

}
