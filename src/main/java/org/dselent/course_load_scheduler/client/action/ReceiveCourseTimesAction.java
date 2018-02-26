package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveCourseTimesAction extends Action{

	private List<User> listOfCourseTimes;
	
	public ReceiveCourseTimesAction(List<User> listOfCourseTimes) {
		this.listOfCourseTimes = listOfCourseTimes;
	}

	public List<User> getListOfCourseTimes() {
		return listOfCourseTimes;
	}

	@Override
	public String toString() {
		return "ReceiveCourseTimesAction [listOfCourseTimes=" + listOfCourseTimes + "]";
	}

	
	
	
}
