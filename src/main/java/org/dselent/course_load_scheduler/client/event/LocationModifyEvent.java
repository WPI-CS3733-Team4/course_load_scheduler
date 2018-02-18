package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.LocationModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;


/* Created by Nathan Siegel */

public class LocationModifyEvent extends GwtEvent<LocationModifyEventHandler>{
	
	public static Type<LocationModifyEventHandler> TYPE = new Type<LocationModifyEventHandler>();
	
	private LocationModifyAction action;
	
	public LocationModifyEvent(LocationModifyAction action)
	{
		this.action = action;
	}
	
	public LocationModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<LocationModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(LocationModifyEventHandler handler)
	{
		handler.onLocationModify(this);
	}

}
