package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendLogoutAction;
import org.dselent.course_load_scheduler.client.event_handler.SendLogoutEventHandler;
/* Modified by Krishna Madhurkar */


public class SendLogoutEvent extends  DisplayEvent<SendLogoutAction,SendLogoutEventHandler> {

    public static Type<SendLogoutEventHandler> TYPE = new Type<>();

    private SendLogoutAction action;

    public SendLogoutEvent(SendLogoutAction action, HasWidgets container) {
        super(action, container);
        this.action = action;
    }

    public SendLogoutAction getAction() {return action;}

    @Override
    public Type<SendLogoutEventHandler> getAssociatedType() { return TYPE; }

    @Override
    protected void dispatch(SendLogoutEventHandler handler) {handler.onSendLogout(this);}
    
	
}
