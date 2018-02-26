package org.dselent.course_load_scheduler.client.callback;

/* Created by Krishna Madhurkar */

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.ReceiveDepartmentsAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveDepartmentsEvent;
import org.dselent.course_load_scheduler.client.translator.impl.ReceiveDepartmentsActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

public class SendDepartmentsCallback extends DisplayCallback<JSONValue>
{
	public SendDepartmentsCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		ReceiveDepartmentsActionTranslatorImpl DepartmentsActionTranslator = new ReceiveDepartmentsActionTranslatorImpl();
		ReceiveDepartmentsAction action = DepartmentsActionTranslator.translateToAction(json);
		
		ReceiveDepartmentsEvent event = new ReceiveDepartmentsEvent(action, getContainer());
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