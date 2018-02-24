package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.CourseSectionModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSectionModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class CourseSectionAddActionTranslatorImpl implements ActionTranslator<CourseSectionModifyAction, CourseSectionModifyAction>
{
	@Override
	public JSONObject translateToJson(CourseSectionModifyAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.COURSE_SECTION_ID), action.getCourseSectionId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.COURSE_ID), action.getCourseId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.SECTION_TYPE), action.getSectionType());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.TERM), action.getTerm());
		
		
		return jsonObject;
	}
	
	@Override
	public CourseSectionModifyAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		Integer courseSectionId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.COURSE_SECTION_ID));
		Integer courseId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.COURSE_ID));
		Integer sectionType = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.SECTION_TYPE));
		String requiredCredits = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseSectionModifyKeys.TERM));
	
		
		
		// possibly use builder pattern if it is a lot of data
		CourseSectionModifyAction action = new CourseSectionModifyAction(courseSectionId, courseId, sectionType,requiredCredits);	
	
		return action;
	}


}