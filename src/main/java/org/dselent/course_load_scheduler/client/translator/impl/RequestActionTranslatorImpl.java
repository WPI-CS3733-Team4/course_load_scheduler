package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.RequestAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.RequestKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
public class RequestActionTranslatorImpl implements ActionTranslator<RequestAction,RequestAction>{
	@Override
	public JSONObject translateToJson(RequestAction action) {
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(RequestKeys.FACULTY_ID), action.getfacultyId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(RequestKeys.COURSE_SECTION_ID), action.getcourseSectionId());
		
		return jsonObject;
	}
	
	@Override
	public RequestAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer facultyId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(RequestKeys.FACULTY_ID));
		Integer courseSectionId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(RequestKeys.COURSE_SECTION_ID));
		
		RequestAction action = new RequestAction(facultyId,courseSectionId);

        return action;
	}
}
