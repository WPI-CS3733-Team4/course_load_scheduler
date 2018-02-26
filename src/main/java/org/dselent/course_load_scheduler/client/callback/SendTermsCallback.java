package org.dselent.course_load_scheduler.client.callback;

/* Created by Krishna Madhurkar */

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.ReceiveTermsAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveTermsEvent;
import org.dselent.course_load_scheduler.client.translator.impl.ReceiveTermsActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

public class SendTermsCallback extends DisplayCallback<JSONValue>
{
	public SendTermsCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		ReceiveTermsActionTranslatorImpl TermsActionTranslator = new ReceiveTermsActionTranslatorImpl();
		ReceiveTermsAction action = TermsActionTranslator.translateToAction(json);
		
		ReceiveTermsEvent event = new ReceiveTermsEvent(action, getContainer());
		eventBus.fireEvent(event);
	}


	@Override
	public void onFailure(Throwable caught)
	{
		// TODO
		// give better exception information
		// these stack traces are not helpful
		
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		InvalidFieldAction ila = new InvalidFieldAction(sb.toString());
		InvalidFieldEvent ile = new InvalidFieldEvent(ila);
		eventBus.fireEvent(ile);
	}

  }