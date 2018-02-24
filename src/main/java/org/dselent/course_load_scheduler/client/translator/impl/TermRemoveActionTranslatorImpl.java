package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.action.TermRemoveAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.TermRemoveKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;


public class TermRemoveActionTranslatorImpl implements ActionTranslator<TermRemoveAction,TermRemoveAction>{
	
	@Override
	public JSONObject translateToJson(TermRemoveAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(TermRemoveKeys.TERM_ID), action.getTermId());
		
		
		return jsonObject;
	}
	
	@Override
	public TermRemoveAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer termId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(TermRemoveKeys.TERM_ID));
		
		
		// possibly use builder pattern if it is a lot of data
		TermRemoveAction action = new TermRemoveAction(termId);
		return action;
	}
}
