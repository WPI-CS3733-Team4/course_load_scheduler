package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.CourseDepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseDepartmentRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class CourseDepartmentRemoveActionTranslatorImpl implements ActionTranslator<CourseDepartmentRemoveAction, CourseDepartmentRemoveAction> {
    @Override
    public JSONObject translateToJson(CourseDepartmentRemoveAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CourseDepartmentRemoveKeys.COURSE_DEPARTMENT_ID), action.getcourseDepartmentId());


        return jsonObject;
    }

    @Override
    public CourseDepartmentRemoveAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer courseDeptID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(CourseDepartmentRemoveKeys.COURSE_DEPARTMENT_ID));


        // possibly use builder pattern if it is a lot of data
        CourseDepartmentRemoveAction action = new CourseDepartmentRemoveAction(courseDeptID);

        return action;
    }


}
