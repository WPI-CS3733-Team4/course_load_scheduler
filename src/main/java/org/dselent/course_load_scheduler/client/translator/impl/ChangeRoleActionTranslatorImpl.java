package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.ChangeRoleAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ChangeRoleKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class ChangeRoleActionTranslatorImpl implements ActionTranslator<ChangeRoleAction, ChangeRoleAction> {
    @Override
    public JSONObject translateToJson(ChangeRoleAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(ChangeRoleKeys.USER_ID), action.getUserId());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(ChangeRoleKeys.USER_ROLE_ID), action.getUserRoleId());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ChangeRoleKeys.ROLE), action.getRole());


        return jsonObject;
    }

    @Override
    public ChangeRoleAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer userID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ChangeRoleKeys.USER_ID));
        Integer userRoleID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ChangeRoleKeys.USER_ROLE_ID));
        String role = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ChangeRoleKeys.ROLE));


        // possibly use builder pattern if it is a lot of data
        ChangeRoleAction action = new ChangeRoleAction(userRoleID, userID, role);

        return action;
    }


}
