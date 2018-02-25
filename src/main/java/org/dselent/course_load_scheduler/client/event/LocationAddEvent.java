package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class LocationAddEvent extends DisplayEvent<LocationAddAction,LocationAddEventHandler>{
	
	public static Type<LocationAddEventHandler> TYPE = new Type<LocationAddEventHandler>();
	
	private LocationAddAction action;
	
	public LocationAddEvent(LocationAddAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public LocationAddAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<LocationAddEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(LocationAddEventHandler handler)
	{
		handler.onLocationAdd(this);
	}

}
