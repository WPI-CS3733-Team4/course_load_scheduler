package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.CourseLoadScheduler;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class FacultyCallback extends DisplayCallback<JSONValue>
{
	public FacultyCallback(SimpleEventBus eventBus, HasWidgets container)
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
		CourseLoadScheduler.facultyScreen();
	
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