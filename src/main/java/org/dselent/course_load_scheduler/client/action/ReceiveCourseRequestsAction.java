package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveCourseRequestsAction extends Action{

	private List<User> listOfCourseRequests;
	
	public ReceiveCourseRequestsAction(List<User> listOfCourseRequests) {
		this.listOfCourseRequests = listOfCourseRequests;
	}

	public List<User> getListOfCourseRequests() {
		return listOfCourseRequests;
	}

	@Override
	public String toString() {
		return "ReceiveCourseRequestsAction [listOfCourseRequests=" + listOfCourseRequests + "]";
	}

	
	
	
}
