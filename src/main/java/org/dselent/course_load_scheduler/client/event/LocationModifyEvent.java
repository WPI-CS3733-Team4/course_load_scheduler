package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.LocationModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.LocationModifyEventHandler;


/* Created by Nathan Siegel */

public class LocationModifyEvent extends DisplayEvent<LocationModifyAction,LocationModifyEventHandler>{
	
	public static Type<LocationModifyEventHandler> TYPE = new Type<LocationModifyEventHandler>();
	
	private LocationModifyAction action;
	
	public LocationModifyEvent(LocationModifyAction action, HasWidgets container)
	{
		super(action, container);
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
