package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidLoginEventHandler;

import com.google.gwt.event.shared.GwtEvent;


public class InvalidLoginEvent extends GwtEvent<InvalidLoginEventHandler>{

	private InvalidLoginAction action;
	
	public static Type<InvalidLoginEventHandler> TYPE = new Type<InvalidLoginEventHandler>();

	public InvalidLoginEvent(InvalidLoginAction action){
		this.action = action;
	}
	
	public InvalidLoginAction getAction() { return this.action; }
	
	@Override
	public Type<InvalidLoginEventHandler> getAssociatedType() { return TYPE; }

	@Override
	protected void dispatch(InvalidLoginEventHandler handler)
	{
		handler.onInvalidLogin(this);
	}
}
