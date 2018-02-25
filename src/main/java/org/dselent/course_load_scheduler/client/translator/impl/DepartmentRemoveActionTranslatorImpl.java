package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.DepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class DepartmentRemoveActionTranslatorImpl implements ActionTranslator<DepartmentRemoveAction,DepartmentRemoveAction>
{
	@Override
	public JSONObject translateToJson(DepartmentRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(DepartmentRemoveKeys.DEPARTMENT_ID), action.getDepartmentId());
		
		return jsonObject;
	}
	
	@Override
	public DepartmentRemoveAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer departmentId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(DepartmentRemoveKeys.DEPARTMENT_ID));
	
		DepartmentRemoveAction action = new DepartmentRemoveAction(departmentId);
		
		return action;
	}
}
