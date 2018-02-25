package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseDepartmentModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseDepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseDepartmentModifyActionTranslatorImpl implements ActionTranslator<CourseDepartmentModifyAction, CourseDepartmentModifyAction> {
    @Override
    public JSONObject translateToJson(CourseDepartmentModifyAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_ID), action.getcourseId());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_DEPARTMENT_ID), action.getcourseDepartmentId());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.DEPARTMENT_ID), action.getcourseDepartmentId());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_NUMBER), action.getcourseNumber());


        return jsonObject;
    }

    @Override
    public CourseDepartmentModifyAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer courseID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_ID));
        Integer courseDeptID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_DEPARTMENT_ID));
        Integer depID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.DEPARTMENT_ID));
        Integer courseNum = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentModifyKeys.COURSE_NUMBER));


        // possibly use builder pattern if it is a lot of data
        CourseDepartmentModifyAction action = new CourseDepartmentModifyAction(courseDeptID, courseID, depID, courseNum);

        return action;
    }


}
