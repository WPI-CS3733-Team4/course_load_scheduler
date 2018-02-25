package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionAddActionTranslatorImpl implements ActionTranslator<CourseSectionAddAction, CourseSectionAddAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionAddKeys.COURSE_ID), action.getCourseId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionAddKeys.SECTION_TYPE), action.getSectionType());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSectionAddKeys.TERM), action.getTerm());
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionAddAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		
		Integer courseId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionAddKeys.COURSE_ID));
		Integer sectionType = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionAddKeys.SECTION_TYPE));
		String requiredCredits = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseSectionAddKeys.TERM));
	
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionAddAction action = new CourseSectionAddAction(courseId, sectionType,requiredCredits);	
	
		return action;
	}


}