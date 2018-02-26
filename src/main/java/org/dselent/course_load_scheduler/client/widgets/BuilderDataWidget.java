package org.dselent.course_load_scheduler.client.widgets;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.CourseSection;
import org.dselent.course_load_scheduler.client.model.CourseTime;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;

public class BuilderDataWidget extends Composite{

	interface BuilderDataWidgetBinder extends UiBinder<Widget, BuilderDataWidget>{}
	
	private static UiBinder<Widget, BuilderDataWidget> binder = GWT.create(BuilderDataWidgetBinder.class);

	@UiField
	static CellTable<Course> courseTable;
	
	@UiField
	static CellTable<CourseSection> courseSectionTable;
	
	@UiField
	static CellTable<CourseTime> courseTimeTable;
	
	// Constructor
	public BuilderDataWidget() {
		initWidget(binder.createAndBindUi(this));
			 
		createCourseHeaders();		
		createSectionHeaders();
		createTimeHeaders();
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
	
	private void createTimeHeaders() {
		TextColumn<CourseTime> idColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getId().toString();
			}
		};
		
		TextColumn<CourseTime> sectionIdColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getCourseSectionsId().toString();
			}
		};
		
		TextColumn<CourseTime> startColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getStartTime().toString();
			}
		};
		
		TextColumn<CourseTime> endColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getEndTime().toString();
			}
		};
		
		TextColumn<CourseTime> weekColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getDayOfWeek().toString();
			}
		};
		
		TextColumn<CourseTime> locationColumn = new TextColumn<CourseTime>() {
			@Override
			public String getValue(CourseTime object) {
				return object.getLocationID().toString();
			}
		};
		
		courseTimeTable.addColumn(idColumn, "ID:");
		courseTimeTable.addColumn(sectionIdColumn, "Section ID:");
		courseTimeTable.addColumn(startColumn, "Start:");
		courseTimeTable.addColumn(endColumn, "End:");
		courseTimeTable.addColumn(weekColumn, "Day:");
		courseTimeTable.addColumn(locationColumn, "Location ID:");
	}
	
	public static void populateCourseTable(List<Course> courseList) {
		courseTable.setRowCount(8, true);
		courseTable.setRowData(0, courseList);
	}
	
	public static void populateSectionTable(List<CourseSection> sectionList) {
		courseSectionTable.setRowCount(8, true);
		courseSectionTable.setRowData(0, sectionList);
	}
	
	public static void populateTimeTable(List<CourseTime> timeList) {
		courseTimeTable.setRowCount(8, true);
		courseTimeTable.setRowData(0, timeList);
	}

}
