package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionRemoveActionTranslatorImpl implements ActionTranslator<CourseSectionRemoveAction, CourseSectionRemoveAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionRemoveKeys.COURSE_SECTION_ID), action.getCourseSectionId());
	
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionRemoveAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		Integer courseSectionId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionRemoveKeys.COURSE_SECTION_ID));
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionRemoveAction action = new CourseSectionRemoveAction(courseSectionId);
		return action;
	}


}