package org.dselent.course_load_scheduler.client.service.impl;


import com.google.gwt.json.client.JSONObject;
import org.dselent.course_load_scheduler.client.action.RequestAction;
import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.callback.FacultyCallback;
import org.dselent.course_load_scheduler.client.event.RequestEvent;
import org.dselent.course_load_scheduler.client.event.UnrequestEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.FacultyService;
import org.dselent.course_load_scheduler.client.translator.impl.RequestActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UnrequestActionTranslatorImpl;

public class FacultyServiceImpl extends BaseServiceImpl implements FacultyService
{
	public FacultyServiceImpl()
	{
		
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		
		eventBusRegistration.put(RequestEvent.TYPE, eventBus.addHandler(RequestEvent.TYPE, this));
		eventBusRegistration.put(UnrequestEvent.TYPE, eventBus.addHandler(UnrequestEvent.TYPE, this));
	
	}
	
	@Override
	public void onRequest(RequestEvent evt)
	{
		RequestAction action = evt.getAction();
		RequestActionTranslatorImpl requestActionTranslator = new RequestActionTranslatorImpl();
		JSONObject json = requestActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.FACULTY_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onUnrequest(UnrequestEvent evt)
	{
		UnrequestAction action = evt.getAction();
		UnrequestActionTranslatorImpl unrequestActionTranslator = new UnrequestActionTranslatorImpl();
		JSONObject json = unrequestActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.FACULTY_REMOVE, facultyCallback, json);
		request.send();
	}
	
}

	
