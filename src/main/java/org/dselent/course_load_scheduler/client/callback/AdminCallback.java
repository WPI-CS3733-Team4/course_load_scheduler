package org.dselent.course_load_scheduler.client.callback;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;

public class AdminCallback extends DisplayCallback<JSONValue>
{
	public AdminCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		/*
		JSONObject json = JSONHelper.getObjectValue(result);
		LoginActionTranslatorImpl loginActionTranslator = new LoginActionTranslatorImpl();
		ReceiveLoginAction action = loginActionTranslator.translateToAction(json);
		
		ReceiveLoginEvent event = new ReceiveLoginEvent(action, getContainer());
		eventBus.fireEvent(event);*/
        GWT.log("Success");
//		CourseLoadScheduler.adminScreen();

        GWT.log("Success2");
	
	}
	  
	@Override
	public void onFailure(Throwable caught)
	{
        GWT.log("Failed");
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