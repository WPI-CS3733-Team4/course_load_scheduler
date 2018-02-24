package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.UserRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.UserRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class UserRemoveActionTranslatorImpl implements ActionTranslator<UserRemoveAction, UserRemoveAction>
{
	@Override
	public JSONObject translateToJson(UserRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(UserRemoveKeys.USER_ID), action.getUserId());
		
		return jsonObject;
	}
	
	@Override
	public UserRemoveAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		Integer userId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(UserRemoveKeys.USER_ID));		
		
		// possibly use builder pattern if it is a lot of data
		UserRemoveAction action = new UserRemoveAction(userId);	
	
		return action;
	}


}
