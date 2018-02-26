package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseSectionsAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveUsersAction;
import org.dselent.course_load_scheduler.client.model.CourseSection;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseSectionsActionKeys;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveUsersActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar*/

public class ReceiveCourseSectionsActionTranslatorImpl implements ActionTranslator<ReceiveCourseSectionsAction,ReceiveCourseSectionsAction>
{
	@Override
	public JSONObject translateToJson(ReceiveCourseSectionsAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseSectionsAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfCourseSections = jsonObject.isArray().get(0).isArray();
		List<CourseSection> tempCourseSectionList = new ArrayList<>();
		for (int i = 0; i < jsonListOfCourseSections.size(); i++) {
			JSONObject CourseSectionstring = jsonListOfCourseSections.get(i).isObject();
			Integer id = JSONHelper.getIntValue(CourseSectionstring, JSONHelper.convertKeyName(ReceiveCourseSectionsActionKeys.ID));
			Integer coursesId = JSONHelper.getIntValue(CourseSectionstring, JSONHelper.convertKeyName(ReceiveCourseSectionsActionKeys.COURSES_ID));
		    String sectionType = JSONHelper.getStringValue(CourseSectionstring, JSONHelper.convertKeyName(ReceiveCourseSectionsActionKeys.SECTION_TYPE));

			
			tempCourseSectionList.add(new CourseSection(id, coursesId, sectionType, null, null));
		}
		
		ReceiveCourseSectionsAction action = new ReceiveCourseSectionsAction(tempCourseSectionList);
		
		return action;
	}
}
