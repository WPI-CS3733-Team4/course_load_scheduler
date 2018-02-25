package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.LocationRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.LocationRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing Yang*/


public class LocationRemoveActionTranslatorImpl implements ActionTranslator<LocationRemoveAction, LocationRemoveAction> {
    @Override
    public JSONObject translateToJson(LocationRemoveAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationRemoveKeys.LOCATION_ID), action.getLocationId());


        return jsonObject;
    }

    @Override
    public LocationRemoveAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer locationID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationRemoveKeys.LOCATION_ID));

        // possibly use builder pattern if it is a lot of data
        LocationRemoveAction action = new LocationRemoveAction(locationID);

        return action;
    }


}
