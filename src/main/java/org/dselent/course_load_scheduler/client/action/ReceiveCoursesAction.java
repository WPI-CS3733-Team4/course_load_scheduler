package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

//Created by Krishna Madhurkar

public class ReceiveCoursesAction extends Action{

	private List<User> listOfCourses;
	
	public ReceiveCoursesAction(List<User> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}

	public List<User> getListOfCourses() {
		return listOfCourses;
	}

	@Override
	public String toString() {
		return "ReceiveCoursesAction [listOfCourses=" + listOfCourses + "]";
	}

	
	
	
}
