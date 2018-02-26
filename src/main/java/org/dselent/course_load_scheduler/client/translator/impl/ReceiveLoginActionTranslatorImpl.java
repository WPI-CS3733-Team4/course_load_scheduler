package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing yang*/

public class ReceiveLoginActionTranslatorImpl implements ActionTranslator<ReceiveLoginAction, ReceiveLoginAction> {
    @Override
    public JSONObject translateToJson(ReceiveLoginAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReceiveLoginKeys.PASSWORD), action.getPassword());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_NAME), action.getUserName());


        return jsonObject;
    }

    @Override
    public ReceiveLoginAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        String username = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_NAME));
        String password = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.PASSWORD));

        User u = new User(null, null);
        u.setUserName(username);
        u.setEncryptedPassword(password);
        // possibly use builder pattern if it is a lot of data
        ReceiveLoginAction action = new ReceiveLoginAction(u);

        return action;
    }


}
