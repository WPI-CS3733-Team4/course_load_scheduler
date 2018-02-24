package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionTimeAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionTimeAddActionTranslatorImpl implements ActionTranslator<CourseSectionTimeAddAction, CourseSectionTimeAddAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionTimeAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.COURSE_SECTION_ID), action.getCourseSectionId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.DAY_OF_WEEK), action.getDayOfWeek());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.START_TIME), action.getStartTime());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.END_TIME), action.getEndTime());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.LOCATION), action.getLocation());
		
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionTimeAddAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		
		Integer courseSectionId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.COURSE_SECTION_ID));
		Integer dayOfWeek = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.DAY_OF_WEEK));
		Integer startTime = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.START_TIME));
		Integer endTime = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.END_TIME));
		String location = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeAddKeys.LOCATION));
		
		
	
	
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionTimeAddAction action = new CourseSectionTimeAddAction(courseSectionId, dayOfWeek,startTime, endTime, location);	
	
		return action;
	}


}