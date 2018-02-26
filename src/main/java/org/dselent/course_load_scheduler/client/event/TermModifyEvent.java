package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.TermModifyAction;
import org.dselent.course_load_scheduler.client.event_handler.TermModifyEventHandler;


/* Created by Nathan Siegel */

public class TermModifyEvent extends DisplayEvent<TermModifyAction,TermModifyEventHandler>{
	
	public static Type<TermModifyEventHandler> TYPE = new Type<TermModifyEventHandler>();
	
	private TermModifyAction action;
	
	public TermModifyEvent(TermModifyAction action, HasWidgets container)
	{
        super(action, container);
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
}
