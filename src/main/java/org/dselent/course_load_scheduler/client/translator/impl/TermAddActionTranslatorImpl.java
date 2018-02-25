package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.TermAddAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.TermAddKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Thananart Piyajarawong */

public class TermAddActionTranslatorImpl implements ActionTranslator<TermAddAction,TermAddAction>
{
	@Override
	public JSONObject translateToJson(TermAddAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(TermAddKeys.TERM_NAME), action.getTermName());		
		
		return jsonObject;
	}
	
	@Override
	public TermAddAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String termName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(TermAddKeys.TERM_NAME));
	
		TermAddAction action = new TermAddAction(termName);
		
		return action;
	}
}
