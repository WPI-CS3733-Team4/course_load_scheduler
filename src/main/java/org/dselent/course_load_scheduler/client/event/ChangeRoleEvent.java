	package org.dselent.course_load_scheduler.client.event;

    import com.google.gwt.user.client.ui.HasWidgets;
    import org.dselent.course_load_scheduler.client.action.ChangeRoleAction;
    import org.dselent.course_load_scheduler.client.event_handler.ChangeRoleEventHandler;


/* Created by Nathan Siegel */

public class ChangeRoleEvent extends DisplayEvent<ChangeRoleAction,ChangeRoleEventHandler>{

    public static Type<ChangeRoleEventHandler> TYPE = new Type<ChangeRoleEventHandler>();

    private ChangeRoleAction action;

    public ChangeRoleEvent(ChangeRoleAction action, HasWidgets container)
    {
        super(action, container);
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

}
