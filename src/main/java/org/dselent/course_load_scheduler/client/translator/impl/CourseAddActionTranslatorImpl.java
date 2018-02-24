package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseAddActionTranslatorImpl implements ActionTranslator<CourseAddAction, CourseAddAction> {
    @Override
    public JSONObject translateToJson(CourseAddAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_NAME), action.getCourseName());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_DEPT), action.getCourseDept());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_DESCRIPTION), action.getCourseDescription());


        return jsonObject;
    }

    @Override
    public CourseAddAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        String courseName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_NAME));
        String courseDept = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_DEPT));
        String courseDescription = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(CourseAddKeys.COURSE_DESCRIPTION));


        // possibly use builder pattern if it is a lot of data
        CourseAddAction action = new CourseAddAction(courseName, courseDept, courseDescription);

        return action;
    }


}
