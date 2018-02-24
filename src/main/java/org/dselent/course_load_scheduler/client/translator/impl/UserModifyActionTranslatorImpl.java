package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.UserModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.UserModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class UserModifyActionTranslatorImpl implements ActionTranslator<UserModifyAction, UserModifyAction>
{
	@Override
	public JSONObject translateToJson(UserModifyAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.USER_ID), action.getUserId());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.FIRST_NAME), action.getFirstName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.LAST_NAME), action.getLastName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.EMAIL), action.getEmail());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserModifyKeys.PASSWORD), action.getPassword());
		
		return jsonObject;
	}
	
	@Override
	public UserModifyAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		Integer userId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.USER_ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.EMAIL));
		String password = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserModifyKeys.PASSWORD));
		
		
		// possibly use builder pattern if it is a lot of data
		UserModifyAction action = new UserModifyAction(userId, userName, firstName, lastName, email, password);	
	
		return action;
	}


}
