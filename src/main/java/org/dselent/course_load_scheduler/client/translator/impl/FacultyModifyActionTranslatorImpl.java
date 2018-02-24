package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.FacultyModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.FacultyModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class FacultyModifyActionTranslatorImpl implements ActionTranslator<FacultyModifyAction, FacultyModifyAction>
{
	@Override
	public JSONObject translateToJson(FacultyModifyAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(FacultyModifyKeys.FACULTY_ID), action.getFacultyId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(FacultyModifyKeys.USER_ID), action.getUserId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(FacultyModifyKeys.REQUIRED_CREDITS), action.getRequiredCredits());
		
		
		return jsonObject;
	}
	
	@Override
	public FacultyModifyAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer facultyId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(FacultyModifyKeys.FACULTY_ID));
		Integer userId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(FacultyModifyKeys.USER_ID));
		Integer requiredCredits = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(FacultyModifyKeys.REQUIRED_CREDITS));
	
		
		
		// possibly use builder pattern if it is a lot of data
		FacultyModifyAction action = new FacultyModifyAction(facultyId, userId, requiredCredits);	
	
		return action;
	}


}
