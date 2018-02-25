package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.ConfirmUserAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ConfirmUserKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class ConfirmUserActionTranslatorImpl implements ActionTranslator<ConfirmUserAction, ConfirmUserAction> {
    @Override
    public JSONObject translateToJson(ConfirmUserAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(ConfirmUserKeys.USER_ID), action.getUserId());


        return jsonObject;
    }

    @Override
    public ConfirmUserAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer userID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ConfirmUserKeys.USER_ID));


        // possibly use builder pattern if it is a lot of data
        ConfirmUserAction action = new ConfirmUserAction(userID);

        return action;
    }


}
