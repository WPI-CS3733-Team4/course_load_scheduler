package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.DepartmentAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Nathan Siegel */

public class DepartmentAddActionTranslatorImpl implements ActionTranslator<DepartmentAddAction,DepartmentAddAction>
{
	@Override
	public JSONObject translateToJson(DepartmentAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(DepartmentAddKeys.DEPARTMENT), action.getDepartment());
		
		return jsonObject;
	}
	
	@Override
	public DepartmentAddAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String department = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(DepartmentAddKeys.DEPARTMENT));
	
		DepartmentAddAction action = new DepartmentAddAction(department);
		
		return action;
	}
}
