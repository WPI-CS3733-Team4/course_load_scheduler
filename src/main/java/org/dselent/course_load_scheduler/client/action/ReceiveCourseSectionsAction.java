
/* Created by Krishna Madhurkar*/

package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.CourseSection;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveCourseSectionsAction extends Action{

	private List<CourseSection> listOfCourseSections;
	
	public ReceiveCourseSectionsAction(List<CourseSection> listOfCourseSections) {
		this.listOfCourseSections = listOfCourseSections;
	}

	public List<CourseSection> getListOfCourseSections() {
		return listOfCourseSections;
	}

	@Override
	public String toString() {
		return "ReceiveCourseSectionsAction [listOfCourseSections=" + listOfCourseSections + "]";
	}

	
	
	
}
