package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.FacultyAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.FacultyAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class FacultyAddActionTranslatorImpl implements ActionTranslator<FacultyAddAction, FacultyAddAction>
{
	@Override
	public JSONObject translateToJson(FacultyAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntegerValue(jsonObject, JSONHelper.convertKeyName(FacultyAddKeys.USER_ID), action.getUserId());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(FacultyAddKeys.REQUIRED_CREDITS), action.getRequiredCredits());
		
		
		return jsonObject;
	}
	
	@Override
	public FacultyAddAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer userId = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.USER_NAME));
		Integer requiredCredits = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.EMAIL));
		String password = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(UserAddKeys.PASSWORD));
		
		
		// possibly use builder pattern if it is a lot of data
		UserAddAction action = new UserAddAction(userName, firstName, lastName, email, password);	
	
		return action;
	}


}
