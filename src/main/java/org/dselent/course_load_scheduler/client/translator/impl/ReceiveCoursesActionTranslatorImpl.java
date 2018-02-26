package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCoursesAction;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCoursesActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar */

public class ReceiveCoursesActionTranslatorImpl implements ActionTranslator<ReceiveCoursesAction,ReceiveCoursesAction>
{
	@Override
	public JSONObject translateToJson(ReceiveCoursesAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveCoursesAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfCourses = jsonObject.isArray().get(0).isArray();
		List<Course> tempCourseList = new ArrayList<>();
		for (int i = 0; i < jsonListOfCourses.size(); i++) {
			JSONObject Coursestring = jsonListOfCourses.get(i).isObject();
			Integer id = JSONHelper.getIntValue(Coursestring, JSONHelper.convertKeyName(ReceiveCoursesActionKeys.ID));
			String courseName = JSONHelper.getStringValue(Coursestring, JSONHelper.convertKeyName(ReceiveCoursesActionKeys.COURSE_NAME));
			String courseDescription = JSONHelper.getStringValue(Coursestring, JSONHelper.convertKeyName(ReceiveCoursesActionKeys.COURSE_DESCRIPTION));
			
			tempCourseList.add(new Course(id,courseName,courseDescription, null, null));
		}
		
		ReceiveCoursesAction action = new ReceiveCoursesAction(tempCourseList);
		
		return action;
	}
}
