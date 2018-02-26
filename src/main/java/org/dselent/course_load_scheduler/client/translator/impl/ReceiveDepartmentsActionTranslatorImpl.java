package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveDepartmentsAction;
import org.dselent.course_load_scheduler.client.model.Department;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveDepartmentsActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Michael Capobianco */

public class ReceiveDepartmentsActionTranslatorImpl implements ActionTranslator<ReceiveDepartmentsAction,ReceiveDepartmentsAction>
{
	@Override
	public JSONObject translateToJson(ReceiveDepartmentsAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveDepartmentsAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfDepartments = jsonObject.isArray().get(0).isArray();
		List<Department> tempDeptList = new ArrayList<>();
		for (int i = 0; i < jsonListOfDepartments.size(); i++) {
			JSONObject deptString = jsonListOfDepartments.get(i).isObject();
			Integer id = JSONHelper.getIntValue(deptString, JSONHelper.convertKeyName(ReceiveDepartmentsActionKeys.ID));
			String department = JSONHelper.getStringValue(deptString, JSONHelper.convertKeyName(ReceiveDepartmentsActionKeys.DEPARTMENT));
			tempDeptList.add(new Department(id, department, null, null));
			}
		
		ReceiveDepartmentsAction action = new ReceiveDepartmentsAction(tempDeptList);
		
		return action;
	}
}
