package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationAddEventHandler;


/* Created by Nathan Siegel */

public class LocationAddEvent extends DisplayEvent<LocationAddAction,LocationAddEventHandler>{
	
	public static Type<LocationAddEventHandler> TYPE = new Type<LocationAddEventHandler>();
	
	private LocationAddAction action;
	
	public LocationAddEvent(LocationAddAction action, HasWidgets container)
	{
		super(action, container);
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
