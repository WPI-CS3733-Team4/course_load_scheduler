package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.UserAddEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;
import org.dselent.course_load_scheduler.client.translator.impl.UserAddActionTranslatorImpl;

public class UserServiceImpl extends BaseServiceImpl implements UserService
{
	public UserServiceImpl()
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
		
		registration = eventBus.addHandler(SendLoginEvent.TYPE, this);
		eventBusRegistration.put(SendLoginEvent.TYPE, registration);
	}
	
	@Override
	public void onSendLogin(SendLoginEvent evt)
	{
		SendLoginAction action = evt.getAction();
		LoginActionTranslatorImpl loginActionTranslator = new LoginActionTranslatorImpl();
		JSONObject json = loginActionTranslator.translateToJson(action);
		SendLoginCallback loginCallback = new SendLoginCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, loginCallback, json);
		request.send();
	}
	
	@Override
	public void onUserAdd(UserAddEvent evt) 
	{
		UserAddAction action = evt.getAction();
		UserAddActionTranslatorImpl addActionTranslator = new UserAddActionTranslatorImpl();
		JSONObject json = addActionTranslator.translateToJson(action);
		UserAddCallback userAddCallback = new UserAddCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_ADD, userAddCallback, json);
		request.send();
	}
}
