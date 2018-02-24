package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.event_handler.UnrequestEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class UnrequestEvent extends GwtEvent<UnrequestEventHandler>{
	
	public static Type<UnrequestEventHandler> TYPE = new Type<UnrequestEventHandler>();
	
	private UnrequestAction action;
	
	public UnrequestEvent(UnrequestAction action)
	{
		this.action = action;
	}
	
	public UnrequestAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<UnrequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(UnrequestEventHandler handler)
	{
		handler.onUnrequest(this);
	}
	
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
