package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseDepartmentAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseDepartmentAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseDepartmentAddActionTranslatorImpl implements ActionTranslator<CourseDepartmentAddAction, CourseDepartmentAddAction> {
    @Override
    public JSONObject translateToJson(CourseDepartmentAddAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.COURSE_NUMBER), action.getcourseNumber());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.COURSE_ID), action.getcourseId());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.DEPARTMENT_ID), action.getdepartmentId());


        return jsonObject;
    }

    @Override
    public CourseDepartmentAddAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer courseID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.COURSE_ID));
        Integer departmentID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.DEPARTMENT_ID));
        Integer courseNumber = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentAddKeys.COURSE_NUMBER));


        // possibly use builder pattern if it is a lot of data
        CourseDepartmentAddAction action = new CourseDepartmentAddAction(courseID, departmentID, courseNumber);

        return action;
    }


}
