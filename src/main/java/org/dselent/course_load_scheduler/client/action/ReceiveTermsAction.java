
/* Created by Krishna Madhurkar */
package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveTermsAction extends Action{

	private List<User> listOfTerms;
	
	public ReceiveTermsAction(List<User> listOfTerms) {
		this.listOfTerms = listOfTerms;
	}

	public List<User> getListOfTerms() {
		return listOfTerms;
	}

	@Override
	public String toString() {
		return "ReceiveTermsAction [listOfTerms=" + listOfTerms + "]";
	}

	
	
	
}
