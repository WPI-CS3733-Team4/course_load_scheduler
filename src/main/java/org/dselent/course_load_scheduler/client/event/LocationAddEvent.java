package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationAddEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class LocationAddEvent extends GwtEvent<LocationAddEventHandler>{
	
	public static Type<LocationAddEventHandler> TYPE = new Type<LocationAddEventHandler>();
	
	private LocationAddAction action;
	
	public LocationAddEvent(LocationAddAction action)
	{
		this.action = action;
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
