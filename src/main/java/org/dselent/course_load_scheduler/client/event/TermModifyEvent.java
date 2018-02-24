package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.TermModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.TermModifyEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;


/* Created by Nathan Siegel */

public class TermModifyEvent extends GwtEvent<TermModifyEventHandler>{
	
	public static Type<TermModifyEventHandler> TYPE = new Type<TermModifyEventHandler>();
	
	private TermModifyAction action;
	
	public TermModifyEvent(TermModifyAction action)
	{
		this.action = action;
	}
	
	public TermModifyAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<TermModifyEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(TermModifyEventHandler handler)
	{
		handler.onTermModify(this);
	}
	public HasWidgets getContainer() {
		return this.getContainer();
	}

}
