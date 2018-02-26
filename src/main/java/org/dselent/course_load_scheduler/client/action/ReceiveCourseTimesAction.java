package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.CourseTime;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveCourseTimesAction extends Action{

	private List<CourseTime> listOfCourseTimes;
	
	public ReceiveCourseTimesAction(List<CourseTime> listOfCourseTimes) {
		this.listOfCourseTimes = listOfCourseTimes;
	}

	public List<CourseTime> getListOfCourseTimes() {
		return listOfCourseTimes;
	}

	@Override
	public String toString() {
		return "ReceiveCourseTimesAction [listOfCourseTimes=" + listOfCourseTimes + "]";
	}

	
	
	
}
