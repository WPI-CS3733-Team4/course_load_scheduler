package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLocationsAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveUsersAction;
import org.dselent.course_load_scheduler.client.model.Location;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLocationsActionKeys;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveUsersActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class ReceiveLocationsActionTranslatorImpl implements ActionTranslator<ReceiveLocationsAction,ReceiveLocationsAction>
{
	@Override
	public JSONObject translateToJson(ReceiveLocationsAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveLocationsAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfLocations = jsonObject.isArray().get(0).isArray();
		List<Location> tempLocationList = new ArrayList<>();
		for (int i = 0; i < jsonListOfLocations.size(); i++) {
			JSONObject locationString = jsonListOfLocations.get(i).isObject();
			Integer id = JSONHelper.getIntValue(locationString, JSONHelper.convertKeyName(ReceiveLocationsActionKeys.ID));
			String building = JSONHelper.getStringValue(locationString, JSONHelper.convertKeyName(ReceiveLocationsActionKeys.BUILDING));
		    String room = JSONHelper.getStringValue(locationString, JSONHelper.convertKeyName(ReceiveLocationsActionKeys.ROOM));
		    Integer roomSize = JSONHelper.getIntValue(locationString, JSONHelper.convertKeyName(ReceiveLocationsActionKeys.ROOM_SIZE));
			
			tempLocationList.add(new Location(id, building, room, roomSize, null, null));
		}
		
		ReceiveLocationsAction action = new ReceiveLocationsAction(tempLocationList);
		
		return action;
	}
}
