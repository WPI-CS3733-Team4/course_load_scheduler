package org.dselent.course_load_scheduler.client.widgets;


import java.util.List;

import org.dselent.course_load_scheduler.client.model.CourseSection;
import org.dselent.course_load_scheduler.client.model.FacultyCourse;
import org.dselent.course_load_scheduler.client.model.Course;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FacultyDataWidget extends Composite{
	
	interface FacultyDataWidgetBinder extends UiBinder<Widget, FacultyDataWidget>{}
	
	private static UiBinder<Widget, FacultyDataWidget> binder = GWT.create(FacultyDataWidgetBinder.class);
	
	@UiField
	static CellTable<FacultyCourse> facultyCourseTable;
	
	@UiField
	static CellTable<Course> courseTable;
	
	@UiField
	static CellTable<CourseSection> courseSectionTable;
	
	// Constructor
	public FacultyDataWidget() {
		initWidget(binder.createAndBindUi(this));
			 
		createFacultyHeaders();		
		createCourseHeaders();
		createSectionHeaders();
	}
	
	private void createFacultyHeaders() {
		TextColumn<FacultyCourse> idColumn = new TextColumn<FacultyCourse>() {
			@Override
			public String getValue(FacultyCourse object) {
				return object.getId().toString();
			}
		};
		
		TextColumn<FacultyCourse> courseIdColumn = new TextColumn<FacultyCourse>() {
			@Override
			public String getValue(FacultyCourse object) {
				return object.getCourseSectionID().toString();
			}
		};
		
		facultyCourseTable.addColumn(idColumn, "ID:");
		facultyCourseTable.addColumn(courseIdColumn, "Section ID:");
	}
	
	private void createCourseHeaders() {
		TextColumn<Course> idColumn = new TextColumn<Course>() {
			@Override
			public String getValue(Course object) {
				return object.getId().toString();
			}
		};
		
		TextColumn<Course> nameColumn = new TextColumn<Course>() {
			@Override
			public String getValue(Course object) {
				return object.getCourseName();
			}
		};
		
		TextColumn<Course> descriptionColumn = new TextColumn<Course>() {
			@Override
			public String getValue(Course object) {
				return object.getCourseDescription();
			}
		};
		
		courseTable.addColumn(idColumn, "ID:");
		courseTable.addColumn(nameColumn, "Name:");
		courseTable.addColumn(descriptionColumn, "Description:");
	}

	private void createSectionHeaders() {
		TextColumn<CourseSection> idColumn = new TextColumn<CourseSection>() {
			@Override
			public String getValue(CourseSection object) {
				return object.getId().toString();
			}
		};
		
		TextColumn<CourseSection> courseIdColumn = new TextColumn<CourseSection>() {
			@Override
			public String getValue(CourseSection object) {
				return object.getCoursesId().toString();
			}
		};
		
		TextColumn<CourseSection> sectionTypeColumn = new TextColumn<CourseSection>() {
			@Override
			public String getValue(CourseSection object) {
				return object.getSectionType();
			}
		};
		
		courseSectionTable.addColumn(idColumn, "ID:");
		courseSectionTable.addColumn(courseIdColumn, "Course ID:");
		courseSectionTable.addColumn(sectionTypeColumn, "Section:");
	}

	public static void populateFacutly(List<FacultyCourse> facultyList) {
		facultyCourseTable.setRowCount(8, true);
		facultyCourseTable.setRowData(0, facultyList);
	}
	
	public static void populateCourse(List<Course> courseList) {
		courseTable.setRowCount(8, true);
		courseTable.setRowData(0, courseList);
	}
	
	public static void populateSection(List<CourseSection> sectionList) {
		courseSectionTable.setRowCount(8, true);
		courseSectionTable.setRowData(0, sectionList);
	}




}