package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.FacultyRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.FacultyRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class FacultyRemoveActionTranslatorImpl implements ActionTranslator<FacultyRemoveAction, FacultyRemoveAction>
{
	@Override
	public JSONObject translateToJson(FacultyRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(FacultyRemoveKeys.FACULTY_ID), action.getFacultyId());
		
		
		
		return jsonObject;
	}
	
	@Override
	public FacultyRemoveAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		Integer facultyId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(FacultyRemoveKeys.FACULTY_ID));
		
		// possibly use builder pattern if it is a lot of data
		FacultyRemoveAction action = new FacultyRemoveAction(facultyId);	
	
		return action;
	}


}
