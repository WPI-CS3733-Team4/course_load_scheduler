package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseRemoveActionTranslatorImpl implements ActionTranslator<CourseRemoveAction, CourseRemoveAction> {
    @Override
    public JSONObject translateToJson(CourseRemoveAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseRemoveKeys.COURSE_ID), action.getcourseId());


        return jsonObject;
    }

    @Override
    public CourseRemoveAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer courseID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseRemoveKeys.COURSE_ID));


        // possibly use builder pattern if it is a lot of data
        CourseRemoveAction action = new CourseRemoveAction(courseID);

        return action;
    }


}
