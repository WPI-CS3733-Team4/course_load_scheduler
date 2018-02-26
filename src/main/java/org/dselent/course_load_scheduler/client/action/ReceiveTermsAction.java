
/* Created by Krishna Madhurkar */
package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Term;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveTermsAction extends Action{

	private List<Term> listOfTerms;
	
	public ReceiveTermsAction(List<Term> listOfTerms) {
		this.listOfTerms = listOfTerms;
	}

	public List<Term> getListOfTerms() {
		return listOfTerms;
	}

	@Override
	public String toString() {
		return "ReceiveTermsAction [listOfTerms=" + listOfTerms + "]";
	}

	
	
	
}
