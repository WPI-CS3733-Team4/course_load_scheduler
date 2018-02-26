package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.ReceiveTermsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveTermsEventHandler;


/* Created by Krishna Madhurkar */

public class ReceiveTermsEvent extends DisplayEvent<ReceiveTermsAction,ReceiveTermsEventHandler>{
	
	public static Type<ReceiveTermsEventHandler> TYPE = new Type<ReceiveTermsEventHandler>();
	
	private ReceiveTermsAction action;
	
	public ReceiveTermsEvent(ReceiveTermsAction action, HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public ReceiveTermsAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<ReceiveTermsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(ReceiveTermsEventHandler handler)
	{
		handler.onReceiveTerms(this);
	}
}
