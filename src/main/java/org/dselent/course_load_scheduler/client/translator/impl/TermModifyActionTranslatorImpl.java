package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.TermModifyAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.TermModifyKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;


public class TermModifyActionTranslatorImpl implements ActionTranslator<TermModifyAction, TermModifyAction>{

	@Override
	public JSONObject translateToJson(TermModifyAction action) {
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(TermModifyKeys.TERM_ID), action.getTermId());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(TermModifyKeys.TERM_NAME), action.getTermName());
	
		return jsonObject;
	}
	
	@Override
	public TermModifyAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer termId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(TermModifyKeys.TERM_ID));
		String termName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(TermModifyKeys.TERM_NAME));
	
		TermModifyAction action = new TermModifyAction(termId,termName);	
		
		return action;
	}
}
