package org.dselent.course_load_scheduler.client.service.impl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.action.UserModifyAction;
import org.dselent.course_load_scheduler.client.action.UserRemoveAction;
import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.action.FacultyModifyAction;
import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.action.ChangeRoleAction;
import org.dselent.course_load_scheduler.client.callback.AdminCallback;
import org.dselent.course_load_scheduler.client.event.UserAddEvent;
import org.dselent.course_load_scheduler.client.event.UserModifyEvent;
import org.dselent.course_load_scheduler.client.event.UserRemoveEvent;
import org.dselent.course_load_scheduler.client.event.FacultyAddEvent;
import org.dselent.course_load_scheduler.client.event.FacultyModifyEvent;
import org.dselent.course_load_scheduler.client.event.FacultyRemoveEvent;
import org.dselent.course_load_scheduler.client.event.ChangeRoleEvent;
import org.dselent.course_load_scheduler.client.event.ConfirmUserEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.AdminService;
import org.dselent.course_load_scheduler.client.translator.impl.UserAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UserModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UserRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.FacultyAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.FacultyModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.FacultyRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.ChangeRoleActionTranslatorImpl;

/* Created by Michael Capobianco */

public class AdminServiceImpl extends BaseServiceImpl implements AdminService
{
	public AdminServiceImpl()
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
		eventBusRegistration.put(UserAddEvent.TYPE, eventBus.addHandler(UserAddEvent.TYPE, this));
		eventBusRegistration.put(UserModifyEvent.TYPE, eventBus.addHandler(UserModifyEvent.TYPE, this));
		eventBusRegistration.put(UserRemoveEvent.TYPE, eventBus.addHandler(UserRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(FacultyAddEvent.TYPE, eventBus.addHandler(FacultyAddEvent.TYPE, this));
		eventBusRegistration.put(FacultyModifyEvent.TYPE, eventBus.addHandler(FacultyModifyEvent.TYPE, this));
		eventBusRegistration.put(FacultyRemoveEvent.TYPE, eventBus.addHandler(FacultyRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(ChangeRoleEvent.TYPE, eventBus.addHandler(ChangeRoleEvent.TYPE, this));
		eventBusRegistration.put(ConfirmUserEvent.TYPE, eventBus.addHandler(ConfirmUserEvent.TYPE, this));
	}
	
	@Override
	public void onUserAdd(UserAddEvent evt)
	{
		UserAddAction action = evt.getAction();
		UserAddActionTranslatorImpl userAddActionTranslator = new UserAddActionTranslatorImpl();
		JSONObject json = userAddActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_ADD, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onUserModify(UserModifyEvent evt)
	{
		UserModifyAction action = evt.getAction();
		UserModifyActionTranslatorImpl userModifyActionTranslator = new UserModifyActionTranslatorImpl();
		JSONObject json = userModifyActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_MODIFY, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onUserRemove(UserRemoveEvent evt)
	{
		UserRemoveAction action = evt.getAction();
		UserRemoveActionTranslatorImpl userRemoveActionTranslator = new UserRemoveActionTranslatorImpl();
		JSONObject json = userRemoveActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_REMOVE, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onFacultyAdd(FacultyAddEvent evt)
	{
		FacultyAddAction action = evt.getAction();
		FacultyAddActionTranslatorImpl facultyAddActionTranslator = new FacultyAddActionTranslatorImpl();
		JSONObject json = facultyAddActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.FACULTY_ADD, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onFacultyModify(FacultyModifyEvent evt)
	{
		FacultyModifyAction action = evt.getAction();
		FacultyModifyActionTranslatorImpl facultyModifyActionTranslator = new FacultyModifyActionTranslatorImpl();
		JSONObject json = facultyModifyActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.FACULTY_MODIFY, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onFacultyRemove(FacultyRemoveEvent evt)
	{
		FacultyRemoveAction action = evt.getAction();
		FacultyRemoveActionTranslatorImpl facultyRemoveActionTranslator = new FacultyRemoveActionTranslatorImpl();
		JSONObject json = facultyRemoveActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.FACULTY_REMOVE, adminCallback, json);
		request.send();
	}
	
	@Override
	public void onChangeRole(ChangeRoleEvent evt)
	{
		ChangeRoleAction action = evt.getAction();
		ChangeRoleActionTranslatorImpl changeRoleActionTranslator = new ChangeRoleActionTranslatorImpl();
		JSONObject json = changeRoleActionTranslator.translateToJson(action);
		AdminCallback adminCallback = new AdminCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_PERMISSION_MODIFY, adminCallback, json);
		request.send();
	}
	
	
}
