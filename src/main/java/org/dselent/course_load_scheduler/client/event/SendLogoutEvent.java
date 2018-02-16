package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.event.shared.GwtEvent;
import org.dselent.course_load_scheduler.client.action.SendLogoutAction;
import org.dselent.course_load_scheduler.client.event_handler.SendLogoutEventHandler;

public class SendLogoutEvent extends GwtEvent<SendLogoutEventHandler> {

    public static Type<SendLogoutEventHandler> TYPE = new Type<>();

    private SendLogoutAction action;

    public SendLogoutEvent(SendLogoutAction action) {this.action = action; }

    public SendLogoutAction getAction() {return action;}

    @Override
    public Type<SendLogoutEventHandler> getAssociatedType() { return TYPE; }

    @Override
    protected void dispatch(SendLogoutEventHandler handler) {handler.onSendLogout(this);}
}
