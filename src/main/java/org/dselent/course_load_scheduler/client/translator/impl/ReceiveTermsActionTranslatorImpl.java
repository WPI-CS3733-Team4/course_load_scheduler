package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveTermsAction;
import org.dselent.course_load_scheduler.client.model.Term;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveTermsActionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DepartmentModifyKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

/* Created by Krishna Madhurkar */

public class ReceiveTermsActionTranslatorImpl implements ActionTranslator<ReceiveTermsAction,ReceiveTermsAction>
{
	@Override
	public JSONObject translateToJson(ReceiveTermsAction action)
	{
		//do nothing
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
	@Override
	public ReceiveTermsAction translateToAction(JSONObject json) {
		JSONValue jsonObject = json.get("success");
		JSONArray jsonListOfTerms = jsonObject.isArray().get(0).isArray();
		List<Term> tempTermList = new ArrayList<>();
		for (int i = 0; i < jsonListOfTerms.size(); i++) {
			JSONObject Termstring = jsonListOfTerms.get(i).isObject();
			Integer id = JSONHelper.getIntValue(Termstring, JSONHelper.convertKeyName(ReceiveTermsActionKeys.ID));
			String termName = JSONHelper.getStringValue(Termstring, JSONHelper.convertKeyName(ReceiveTermsActionKeys.TERM_NAME));
			
			tempTermList.add(new Term(id, termName, null, null));
		}
		
		ReceiveTermsAction action = new ReceiveTermsAction(tempTermList);
		
		return action;
	}
}
