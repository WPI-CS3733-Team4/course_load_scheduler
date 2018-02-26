package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveUsersAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveUsersActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class ReceiveUsersActionTranslatorImpl implements ActionTranslator<ReceiveUsersAction,ReceiveUsersAction>
{
	@Override
	public JSONObject translateToJson(ReceiveUsersAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveUsersAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfUsers = jsonObject.isArray().get(0).isArray();
		List<User> tempUserList = new ArrayList<>();
		for (int i = 0; i < jsonListOfUsers.size(); i++) {
			JSONObject userString = jsonListOfUsers.get(i).isObject();
			Integer id = JSONHelper.getIntValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.ID));
			String userName = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.USER_NAME));
			String firstName = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.FIRST_NAME));
			String lastName = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.LAST_NAME));
			String email = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.EMAIL));
			String encryptedPassword = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.ENCRYPTED_PASSWORD));
			String salt = JSONHelper.getStringValue(userString, JSONHelper.convertKeyName(ReceiveUsersActionKeys.SALT));
			tempUserList.add(new User(id,userName,firstName,lastName,email,encryptedPassword,salt, null, null));
		}
		
		ReceiveUsersAction action = new ReceiveUsersAction(tempUserList);
		
		return action;
	}
}
