

/* Created by Krishna Madhurkar */

package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveTermsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveTermsEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveTermsEvent extends DisplayEvent<ReceiveTermsAction, ReceiveTermsEventHandler>
{
	public static Type<ReceiveTermsEventHandler> TYPE = new Type<ReceiveTermsEventHandler>();
	
	public ReceiveTermsEvent(ReceiveTermsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveTermsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveTermsEventHandler handler)
	{
		handler.onReceiveTerms(this);
	}
}
