package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveUserRolesAction;
import org.dselent.course_load_scheduler.client.model.UserPermission;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveUserRolesActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Michael Capobianco */

public class ReceiveUserRolesActionTranslatorImpl implements ActionTranslator<ReceiveUserRolesAction,ReceiveUserRolesAction>
{
	@Override
	public JSONObject translateToJson(ReceiveUserRolesAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveUserRolesAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfUserRoles = jsonObject.isArray().get(0).isArray();
		List<UserPermission> tempUserRoleList = new ArrayList<>();
		for (int i = 0; i < jsonListOfUserRoles.size(); i++) {
			JSONObject userRoleString = jsonListOfUserRoles.get(i).isObject();
			Integer id = JSONHelper.getIntValue(userRoleString, JSONHelper.convertKeyName(ReceiveUserRolesActionKeys.ID));
			Integer userId = JSONHelper.getIntValue(userRoleString, JSONHelper.convertKeyName(ReceiveUserRolesActionKeys.USER_ID));
			String role = JSONHelper.getStringValue(userRoleString, JSONHelper.convertKeyName(ReceiveUserRolesActionKeys.ROLE));
			
			tempUserRoleList.add(new UserPermission(id, userId, role, null, null));
		}
		
		ReceiveUserRolesAction action = new ReceiveUserRolesAction(tempUserRoleList);
		
		return action;
	}
}
