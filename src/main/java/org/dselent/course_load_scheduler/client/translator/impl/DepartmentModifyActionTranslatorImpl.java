package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class DepartmentModifyActionTranslatorImpl implements ActionTranslator<DepartmentModifyAction,DepartmentModifyAction>
{
	@Override
	public JSONObject translateToJson(DepartmentModifyAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(DepartmentModifyKeys.DEPARTMENT_ID), action.getDepartmentId());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(DepartmentModifyKeys.DEPARTMENT), action.getDepartment());
		
		return jsonObject;
	}
	
	@Override
	public DepartmentModifyAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer departmentId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(DepartmentModifyKeys.DEPARTMENT_ID));
		String department = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(DepartmentModifyKeys.DEPARTMENT));
	
		DepartmentModifyAction action = new DepartmentModifyAction(departmentId, department);
		
		return action;
	}
}
