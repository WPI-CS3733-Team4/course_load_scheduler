package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.UserAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class UserAddActionTranslatorImpl implements ActionTranslator<UserAddAction, UserAddAction>
{
	@Override
	public JSONObject translateToJson(UserAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserAddKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserAddKeys.FIRST_NAME), action.getFirstName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserAddKeys.LAST_NAME), action.getLastName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserAddKeys.EMAIL), action.getEmail());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UserAddKeys.PASSWORD), action.getPassword());
		
		return jsonObject;
	}
	
	@Override
	public UserAddAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.EMAIL));
		String password = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.PASSWORD));
		
		
		// possibly use builder pattern if it is a lot of data
		UserAddAction action = new UserAddAction(userName, firstName, lastName, email, password);	
	
		return action;
	}


}
