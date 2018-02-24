package org.dselent.course_load_scheduler.client.translator.impl;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.LocationAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

/* Created by Zhengxing Yang*/


public class LocationAddActionTranslatorImpl implements ActionTranslator<LocationAddAction, LocationAddAction>
{
	@Override
	public JSONObject translateToJson(LocationAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(LocationAddKeys.BUILDING), action.getBuilding());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationAddKeys.ROOM), action.getRoom());
        JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(LocationAddKeys.ROOM_SIZE), action.getRoomSize());
		
		
		return jsonObject;
	}
	
	@Override
	public LocationAddAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		

		String building = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(LocationAddKeys.BUILDING));
        Integer room = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationAddKeys.ROOM));
        Integer roomSize = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(LocationAddKeys.ROOM_SIZE));
	
		
		
		// possibly use builder pattern if it is a lot of data
		LocationAddAction action = new LocationAddAction(building, room, roomSize);
	
		return action;
	}


}
