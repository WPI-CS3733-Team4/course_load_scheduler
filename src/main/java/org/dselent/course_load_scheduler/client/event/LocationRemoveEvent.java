package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.LocationRemoveAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationRemoveEventHandler;


/* Created by Nathan Siegel */

public class LocationRemoveEvent extends DisplayEvent<LocationRemoveAction,LocationRemoveEventHandler>{
	
	public static Type<LocationRemoveEventHandler> TYPE = new Type<LocationRemoveEventHandler>();
	
	private LocationRemoveAction action;
	
	public LocationRemoveEvent(LocationRemoveAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public LocationRemoveAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<LocationRemoveEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(LocationRemoveEventHandler handler)
	{
		handler.onLocationRemove(this);
	}

}
