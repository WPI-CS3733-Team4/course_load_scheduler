package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.CourseSectionTimeModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionTimeModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionTimeModifyActionTranslatorImpl implements ActionTranslator<CourseSectionTimeModifyAction, CourseSectionTimeModifyAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionTimeModifyAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.COURSE_SECTION_TIME_ID), action.getCourseSectionTimeId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.COURSE_SECTION_ID), action.getCourseSectionId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.DAY_OF_WEEK), action.getDayOfWeek());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.START_TIME), action.getStartTime());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.END_TIME), action.getEndTime());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.LOCATION), action.getLocation());
		
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionTimeModifyAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		Integer courseSectionTimeId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.COURSE_SECTION_TIME_ID));
		Integer courseSectionId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.COURSE_SECTION_ID));
		Integer dayOfWeek = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.DAY_OF_WEEK));
		Integer startTime = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.START_TIME));
		Integer endTime = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.END_TIME));
		String location = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseSectionTimeModifyKeys.LOCATION));
		
		
	
	
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionTimeModifyAction action = new CourseSectionTimeModifyAction(courseSectionTimeId, courseSectionId, dayOfWeek,startTime, endTime, location);	
	
		return action;
	}


}