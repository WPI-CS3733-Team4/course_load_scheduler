package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.CourseSectionTimeRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionTimeRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionTimeRemoveActionTranslatorImpl implements ActionTranslator<CourseSectionTimeRemoveAction, CourseSectionTimeRemoveAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionTimeRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeRemoveKeys.COURSE_SECTION_TIME_ID), action.getCourseSectionTimeId());
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionTimeRemoveAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		Integer courseSectionTimeId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeRemoveKeys.COURSE_SECTION_TIME_ID));
		
	
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionTimeRemoveAction action = new CourseSectionTimeRemoveAction(courseSectionTimeId);
		return action;
	}


}