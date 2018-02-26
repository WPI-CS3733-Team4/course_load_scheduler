package org.dselent.course_load_scheduler.client.event;

import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.SendTermsAction;
import org.dselent.course_load_scheduler.client.event_handler.SendTermsEventHandler;


/* Created by Krishna Madhurkar */

public class SendTermsEvent extends DisplayEvent<SendTermsAction,SendTermsEventHandler>{
	
	public static Type<SendTermsEventHandler> TYPE = new Type<SendTermsEventHandler>();
	
	private SendTermsAction action;
	
	public SendTermsEvent(SendTermsAction action, HasWidgets container)
	{
        super(action, container);
        this.action = action;
	}
	
	public SendTermsAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<SendTermsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(SendTermsEventHandler handler)
	{
		handler.onSendTerms(this);
	}
}
