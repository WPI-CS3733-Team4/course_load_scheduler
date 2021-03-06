package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.event_handler.UnrequestEventHandler;


/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class UnrequestEvent extends DisplayEvent<UnrequestAction,UnrequestEventHandler>{
	
	public static Type<UnrequestEventHandler> TYPE = new Type<UnrequestEventHandler>();
	
	private UnrequestAction action;
	
	public UnrequestEvent(UnrequestAction action, HasWidgets container)
	{
        super(action, container);
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
	
	
}
