package org.dselent.course_load_scheduler.client.callback;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;

public class BuilderCallback extends DisplayCallback<JSONValue>
{
	public BuilderCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
        GWT.log("success");
        GWT.log(result.toString());
//
//
//		JSONObject json = JSONHelper.getObjectValue(result);
//		JSONValue successList = json.get("success");
//
//        JSONArray  ja = (JSONArray) successList;
//
//        GWT.log(ja.get(0).toString());
//		CourseLoadScheduler.builderScreen();
	
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