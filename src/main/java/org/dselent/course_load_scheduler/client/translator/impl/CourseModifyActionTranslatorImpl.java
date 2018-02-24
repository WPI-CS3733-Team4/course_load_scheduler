package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseModifyActionTranslatorImpl implements ActionTranslator<CourseModifyAction, CourseModifyAction> {
    @Override
    public JSONObject translateToJson(CourseModifyAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_ID), action.getcourseId());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_NAME), action.getCourseName());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_DEPT), action.getCourseDept());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_DESCRIPTION), action.getCourseDescription());


        return jsonObject;
    }

    @Override
    public CourseModifyAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer courseID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_ID));
        String courseName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_NAME));
        String courseDept = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_DEPT));
        String courseDescription = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseModifyKeys.COURSE_DESCRIPTION));


        // possibly use builder pattern if it is a lot of data
        CourseModifyAction action = new CourseModifyAction(courseID, courseName, courseDept, courseDescription);

        return action;
    }


}
