package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.UnrequestKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class UnrequestActionTranslatorImpl implements ActionTranslator<UnrequestAction, UnrequestAction> {
    @Override
    public JSONObject translateToJson(UnrequestAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(UnrequestKeys.COURSE_REQUEST_ID), action.getcourseRequestId());


        return jsonObject;
    }

    @Override
    public UnrequestAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer reqID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(UnrequestKeys.COURSE_REQUEST_ID));

        // possibly use builder pattern if it is a lot of data
        UnrequestAction action = new UnrequestAction(reqID);

        return action;
    }


}
