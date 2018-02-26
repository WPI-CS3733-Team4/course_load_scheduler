package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseRequestsAction;
import org.dselent.course_load_scheduler.client.model.CourseRequest;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseRequestsActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class ReceiveCourseRequestsActionTranslatorImpl implements ActionTranslator<ReceiveCourseRequestsAction,ReceiveCourseRequestsAction>{
	@Override 
	public JSONObject translateToJson(ReceiveCourseRequestsAction action) {
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseRequestsAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfCourseRequests = jsonObject.isArray().get(0).isArray();
		List<CourseRequest> tempCourseRequestsList = new ArrayList<>();
		
		for(int i=0;i<jsonListOfCourseRequests.size();i++) {
			JSONObject userString = jsonListOfCourseRequests.get(i).isObject();
			
			Integer id = JSONHelper.getIntValue(userString, JSONHelper.convertKeyName(ReceiveCourseRequestsActionKeys.ID));
			Integer faculty_id = JSONHelper.getIntValue(userString, JSONHelper.convertKeyName(ReceiveCourseRequestsActionKeys.FACULTY_ID));
			Integer course_section_id = JSONHelper.getIntValue(userString, JSONHelper.convertKeyName(ReceiveCourseRequestsActionKeys.COURSE_SECTION_ID));
			tempCourseRequestsList.add(new CourseRequest(id,faculty_id,course_section_id,null,null));
			}
		
			ReceiveCourseRequestsAction action = new ReceiveCourseRequestsAction(tempCourseRequestsList);
		
			return action;
		}
}
