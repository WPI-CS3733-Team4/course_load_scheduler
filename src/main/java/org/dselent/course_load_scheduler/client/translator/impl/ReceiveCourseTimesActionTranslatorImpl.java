package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseTimesAction;
import org.dselent.course_load_scheduler.client.model.CourseTime;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseTimesActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class ReceiveCourseTimesActionTranslatorImpl implements ActionTranslator<ReceiveCourseTimesAction,ReceiveCourseTimesAction>
{
	@Override
	public JSONObject translateToJson(ReceiveCourseTimesAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseTimesAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfCourseTimes = jsonObject.isArray().get(0).isArray();
		List<CourseTime> tempCourseTimeList = new ArrayList<>();
		for (int i = 0; i < jsonListOfCourseTimes.size(); i++) {
			JSONObject CourseTimestring = jsonListOfCourseTimes.get(i).isObject();
			Integer id = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.ID));
			Integer courseSectionsId = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.COURSE_SECTIONS_ID));
			Integer dayOfWeek = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.DAY_OF_WEEK));
			Integer startTime = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.START_TIME));
			Integer endTime = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.END_TIME));
			Integer locationID = JSONHelper.getIntValue(CourseTimestring, JSONHelper.convertKeyName(ReceiveCourseTimesActionKeys.LOCATION_ID));
			tempCourseTimeList.add(new CourseTime(id,courseSectionsId,dayOfWeek,startTime,endTime,locationID, null, null));
		}
		
		ReceiveCourseTimesAction action = new ReceiveCourseTimesAction(tempCourseTimeList);
		
		return action;
	}
}
