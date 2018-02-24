package org.dselent.course_load_scheduler.client.translator.impl;


import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
public class SendLoginActionTranslatorImpl implements ActionTranslator<SendLoginAction,SendLoginAction>{
	
	@Override
	public JSONObject translateToJson(SendLoginAction action) {
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendLoginKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendLoginKeys.PASSWORD), action.getPassword());
	
		return jsonObject;
	}
	
	@Override
	public SendLoginAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(SendLoginKeys.USER_NAME));
		String password = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(SendLoginKeys.PASSWORD));
	
		SendLoginAction action = new SendLoginAction(userName, password);
		
		return action;
	}
}
