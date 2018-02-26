package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.CourseRequest;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveCourseRequestsAction extends Action{

	private List<CourseRequest> listOfCourseRequests;
	
	public ReceiveCourseRequestsAction(List<CourseRequest> listOfCourseRequests) {
		this.listOfCourseRequests = listOfCourseRequests;
	}

	public List<CourseRequest> getListOfCourseRequests() {
		return listOfCourseRequests;
	}

	@Override
	public String toString() {
		return "ReceiveCourseRequestsAction [listOfCourseRequests=" + listOfCourseRequests + "]";
	}

	
	
	
}
