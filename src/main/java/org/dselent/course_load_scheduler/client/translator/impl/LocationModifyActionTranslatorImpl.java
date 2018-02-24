package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.LocationModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.LocationModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing Yang*/


public class LocationModifyActionTranslatorImpl implements ActionTranslator<LocationModifyAction, LocationModifyAction> {
    @Override
    public JSONObject translateToJson(LocationModifyAction action) {
        JSONObject jsonObject = new JSONObject();

        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationModifyKeys.LOCATION_ID), action.getlocationId());
        JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(LocationModifyKeys.BUILDING), action.getBuilding());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationModifyKeys.ROOM), action.getRoom());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationModifyKeys.ROOM_SIZE), action.getRoomSize());


        return jsonObject;
    }

    @Override
    public LocationModifyAction translateToAction(JSONObject json) {
        // null values will not have their keys sent back from the sever
        // this will throw an exception here
        // you may choose to handle the exception as you wish

        // sent timestamps as epoch seconds (long)

        JSONValue jsonObject = json.get("success");
        JSONObject userObject = jsonObject.isArray().get(0).isObject();


        Integer locationID = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationModifyKeys.LOCATION_ID));
        String building = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(LocationModifyKeys.BUILDING));
        Integer room = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationModifyKeys.ROOM));
        Integer roomSize = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationModifyKeys.ROOM_SIZE));


        // possibly use builder pattern if it is a lot of data
        LocationModifyAction action = new LocationModifyAction(locationID, building, room, roomSize);

        return action;
    }


}
