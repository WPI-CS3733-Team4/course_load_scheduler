package org.dselent.course_load_scheduler.client.service.impl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

import org.dselent.course_load_scheduler.client.service.BuilderService;
import org.dselent.course_load_scheduler.client.translator.impl.UserAddActionTranslatorImpl;

public class BuilderServiceImpl extends BaseServiceImpl implements BuilderService
{
	public BuilderServiceImpl()
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
	public void onUserRegister(UserRegisterEvent evt) 
	{
		UserRegisterAction action = evt.getAction();
		UserRegisterActionTranslatorImpl registerActionTranslator = new UserRegisterActionTranslatorImpl();
		JSONObject json = registerActionTranslator.translateToJson(action);
		UserRegisterCallback userRegisterCallback = new UserRegisterCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_ADD, userRegisterCallback, json);
		request.send();
	}
}
