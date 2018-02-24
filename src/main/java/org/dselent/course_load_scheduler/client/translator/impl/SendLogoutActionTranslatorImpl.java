package org.dselent.course_load_scheduler.client.translator.impl;


import org.dselent.course_load_scheduler.client.action.SendLogoutAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendLogoutKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class SendLogoutActionTranslatorImpl implements ActionTranslator <SendLogoutAction,SendLogoutAction>{
	@Override
	public JSONObject translateToJson(SendLogoutAction action) {
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendLogoutKeys.USER_ID), action.getUserId());
		
		return jsonObject;
	}
	
	@Override
	public SendLogoutAction translateToAction(JSONObject json) {
		

		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer userId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(SendLogoutKeys.USER_ID));
	

		// possibly use builder pattern if it is a lot of data
		SendLogoutAction action = new SendLogoutAction(userId);
		return action;
	}
}
