package org.dselent.course_load_scheduler.client.service.impl;


import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.action.FacultyModifyAction;
import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.event.FacultyAddEvent;
import org.dselent.course_load_scheduler.client.event.FacultyModifyEvent;
import org.dselent.course_load_scheduler.client.event.FacultyRemoveEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

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
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(SendFacEvent.TYPE, this);
		eventBusRegistration.put(SendLoginEvent.TYPE, registration);
	}
	
	@Override
	public void onFacultyAdd(FacultyAddEvent. evt)
	{
		FacultyAddAction action = evt.getAction();
		FacultyAddActionTranslatorImpl facultyAddActionTranslator = new LoginActionTranslatorImpl();
		JSONObject json = loginActionTranslator.translateToJson(action);
		FacultyAddCallback facultyAddCallback = new FacultyAddCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, facultyAddCallback, json);
		request.send();
	}
}

	
