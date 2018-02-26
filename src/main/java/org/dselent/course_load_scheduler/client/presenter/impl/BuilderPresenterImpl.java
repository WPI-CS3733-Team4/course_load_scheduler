package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidCourseStrings;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.CourseAddEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.BuilderPresenter;
import org.dselent.course_load_scheduler.client.view.BuilderView;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;
import org.dselent.course_load_scheduler.client.event.CourseModifyEvent;
import org.dselent.course_load_scheduler.client.action.CourseModifyAction;
import org.dselent.course_load_scheduler.client.event.CourseRemoveEvent;
import org.dselent.course_load_scheduler.client.action.CourseRemoveAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionAddEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionModifyEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionModifyAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionRemoveEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeAddEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeAddAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeModifyEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeModifyAction;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeRemoveEvent;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeRemoveAction;
import org.dselent.course_load_scheduler.client.event.LocationAddEvent;
import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.event.LocationModifyEvent;
import org.dselent.course_load_scheduler.client.action.LocationModifyAction;
import org.dselent.course_load_scheduler.client.event.LocationRemoveEvent;
import org.dselent.course_load_scheduler.client.action.LocationRemoveAction;
import org.dselent.course_load_scheduler.client.event.DepartmentAddEvent;
import org.dselent.course_load_scheduler.client.action.DepartmentAddAction;
import org.dselent.course_load_scheduler.client.event.DepartmentModifyEvent;
import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.event.DepartmentRemoveEvent;
import org.dselent.course_load_scheduler.client.action.DepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.event.TermAddEvent;
import org.dselent.course_load_scheduler.client.action.TermAddAction;
import org.dselent.course_load_scheduler.client.event.TermModifyEvent;
import org.dselent.course_load_scheduler.client.action.TermModifyAction;
import org.dselent.course_load_scheduler.client.event.TermRemoveEvent;
import org.dselent.course_load_scheduler.client.action.TermRemoveAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidTimeStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidSectionStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidTermStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidDepartmentStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidLocationStrings;

/* Created by Michael Capobianco and Nathan Siegel */

public class BuilderPresenterImpl extends BasePresenterImpl implements BuilderPresenter
{
	private IndexPresenter parentPresenter;
	private BuilderView view;
	private boolean addCourseClickInProgress;
	private boolean modifyCourseClickInProgress;
	private boolean removeCourseClickInProgress;
	private boolean addSectionsClickInProgress;
	private boolean modifySectionsClickInProgress;
	private boolean removeSectionsClickInProgress;
	private boolean addTimeClickInProgress;
	private boolean modifyTimeClickInProgress;
	private boolean removeTimeClickInProgress;
	private boolean addLocationClickInProgress;
	private boolean modifyLocationClickInProgress;
	private boolean removeLocationClickInProgress;
	private boolean addDepartmentClickInProgress;
	private boolean modifyDepartmentClickInProgress;
	private boolean removeDepartmentClickInProgress;
	private boolean addTermClickInProgress;
	private boolean modifyTermClickInProgress;
	private boolean removeTermClickInProgress;

	@Inject
	public BuilderPresenterImpl(IndexPresenter parentPresenter, BuilderView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		addCourseClickInProgress = false;
		modifyCourseClickInProgress = false;
		removeCourseClickInProgress = false;
		addSectionsClickInProgress = false;
		modifySectionsClickInProgress = false;
		removeSectionsClickInProgress = false;
		addTimeClickInProgress = false;
		modifyTimeClickInProgress = false;
		removeTimeClickInProgress = false;
		addLocationClickInProgress = false;
		modifyLocationClickInProgress = false;
		removeLocationClickInProgress = false;
		addDepartmentClickInProgress = false;
		modifyDepartmentClickInProgress = false;
		removeDepartmentClickInProgress = false;
		addTermClickInProgress = false;
		modifyTermClickInProgress = false;
		removeTermClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidFieldEvent.TYPE, this);
		eventBusRegistration.put(InvalidFieldEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public BuilderView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}
	
	@Override
	public void addCourses()
	{
		if(!addCourseClickInProgress) 
		{
			addCourseClickInProgress = true;
			view.getAddCoursesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			String courseDept = null;
			String courseDescription = null;
			String courseName = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try 
			{
				checkEmptyString(courseDept = view.getCourseDeptTextBox().getText());
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_DEPT);
				fieldsAreValid = false;
			}
			try 
			{
				checkEmptyString(courseDescription = view.getCourseDescriptionTextBox().getText());
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_DESCRIPTION);
				fieldsAreValid = false;
			}
			try 
			{
				checkEmptyString(courseName = view.getCourseNameTextBox().getText());
				fieldsAreValid = false;
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_NAME);
			}
			if (fieldsAreValid) 
			{
				sendAddCourse(courseName, courseDept, courseDescription);
				fieldsAreValid = false;
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddCourse(String courseName, String courseDept, String courseDescription) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseAddAction sla = new CourseAddAction(courseName, courseDept, courseDescription);
		CourseAddEvent sle = new CourseAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void modifyCourses()
	{
		if(!modifyCourseClickInProgress) 
		{
			modifyCourseClickInProgress = true;
			view.getModifyCoursesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseId = null;
			String courseDept = null;
			String courseDescription = null;
			String courseName = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseId = Integer.parseInt(view.getCourseIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_ID);
				fieldsAreValid = false;
			}
			try 
			{
				checkEmptyString(courseDept = view.getCourseDeptTextBox().getText());
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_DEPT);
				fieldsAreValid = false;
			}
			try 
			{
				checkEmptyString(courseDescription = view.getCourseDescriptionTextBox().getText());
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_DESCRIPTION);
				fieldsAreValid = false;
			}
			try 
			{
				checkEmptyString(courseName = view.getCourseNameTextBox().getText());
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_NAME);
				fieldsAreValid = false;
			}
			if (fieldsAreValid) 
			{
				sendModifyCourse(courseId, courseName, courseDept, courseDescription);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	
	public void sendModifyCourse(Integer courseId, String courseName, String courseDept, String courseDescription) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseModifyAction sla = new CourseModifyAction(courseId, courseName, courseDept, courseDescription);
		CourseModifyEvent sle = new CourseModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void removeCourses()
	{
		if(!removeCourseClickInProgress) 
		{
			removeCourseClickInProgress = true;
			view.getModifyCoursesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseId = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseId = Integer.parseInt(view.getCourseIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidCourseStrings.NULL_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendRemoveCourse(courseId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveCourse(Integer courseId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseRemoveAction sla = new CourseRemoveAction(courseId);
		CourseRemoveEvent sle = new CourseRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void addCourseSectionTimes()
	{
		if(!addTimeClickInProgress) 
		{
			addTimeClickInProgress = true;
			view.getAddCourseSectionTimesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseSectionId = null;
			Integer dayOfWeek = null;
			Integer startTime = null;
			Integer endTime = null;
			String location = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseSectionId = Integer.parseInt(view.getCourseSectionIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_SECTION);
				fieldsAreValid = false;
			}
			try
			{
				dayOfWeek = Integer.parseInt(view.getDayOfWeekTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_DAY);
				fieldsAreValid = false;
			}
			try
			{
				startTime = Integer.parseInt(view.getStartTimeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_START);
				fieldsAreValid = false;
			}
			try
			{
				endTime = Integer.parseInt(view.getEndTimeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_END);
				fieldsAreValid = false;
			}
			try
			{
				checkEmptyString(location = view.getLocationTextBox().getText());
			}
			catch (EmptyStringException e) 
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_LOCATION);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendAddCourseSectionsTimes(courseSectionId, dayOfWeek, startTime, endTime, location);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddCourseSectionsTimes(Integer courseSectionId, Integer dayOfWeek, Integer startTime, Integer endTime, String location) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionTimeAddAction sla = new CourseSectionTimeAddAction(courseSectionId, dayOfWeek, startTime, endTime, location);
		CourseSectionTimeAddEvent sle = new CourseSectionTimeAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	
	@Override
	public void modifyCourseSectionTimes()
	{
		if(!modifyTimeClickInProgress) 
		{
			modifyTimeClickInProgress = true;
			view.getModifyCourseSectionTimesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseSectionTimeId = null;
			Integer courseSectionId = null;
			Integer dayOfWeek = null;
			Integer startTime = null;
			Integer endTime = null;
			String location = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseSectionTimeId = Integer.parseInt(view.getCourseSectionTimeIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_TIME_ID);
				fieldsAreValid = false;
			}
			try
			{
				courseSectionId = Integer.parseInt(view.getCourseSectionIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_SECTION);
				fieldsAreValid = false;
			}
			try
			{
				dayOfWeek = Integer.parseInt(view.getDayOfWeekTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_DAY);
				fieldsAreValid = false;
			}
			try
			{
				startTime = Integer.parseInt(view.getStartTimeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_START);
				fieldsAreValid = false;
			}
			try
			{
				endTime = Integer.parseInt(view.getEndTimeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_END);
				fieldsAreValid = false;
			}
			try
			{
				checkEmptyString(location = view.getLocationTextBox().getText());
			}
			catch (EmptyStringException e) 
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_LOCATION);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendModifyCourseSectionsTimes(courseSectionTimeId, courseSectionId, dayOfWeek, startTime, endTime, location);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendModifyCourseSectionsTimes(Integer courseSectionTimeId, Integer courseSectionId, Integer dayOfWeek, Integer startTime, Integer endTime, String location) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionTimeModifyAction sla = new CourseSectionTimeModifyAction(courseSectionTimeId, courseSectionId, dayOfWeek, startTime, endTime, location);
		CourseSectionTimeModifyEvent sle = new CourseSectionTimeModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void removeCourseSectionTimes()
	{
		if(!removeTimeClickInProgress) 
		{
			removeTimeClickInProgress = true;
			view.getRemoveCourseSectionTimesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseSectionTimeId = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseSectionTimeId = Integer.parseInt(view.getCourseSectionTimeIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTimeStrings.NULL_TIME_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendRemoveCourseSectionsTimes(courseSectionTimeId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveCourseSectionsTimes(Integer courseSectionTimeId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionTimeRemoveAction sla = new CourseSectionTimeRemoveAction(courseSectionTimeId);
		CourseSectionTimeRemoveEvent sle = new CourseSectionTimeRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void addCourseSections()
	{
		if(!addSectionsClickInProgress) 
		{
			addSectionsClickInProgress = true;
			view.getAddSectionsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer course = null;
			Integer sectionType = null;
			String term = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				course = Integer.parseInt(view.getCourseTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_COURSE);
				fieldsAreValid = false;
			}
			try
			{
				sectionType = Integer.parseInt(view.getSectionTypeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_SECTION_TYPE);
				fieldsAreValid = false;
			}
			try
			{
				term = view.getTermIdTextBox().getText();
				checkEmptyString(term);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_TERM);
				fieldsAreValid = false;
			}
			
			
			if (fieldsAreValid) 
			{
				sendAddSections(course, sectionType, term);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddSections(Integer course, Integer sectionType, String term) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionAddAction sla = new CourseSectionAddAction(course, sectionType, term);
		CourseSectionAddEvent sle = new CourseSectionAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void modifyCourseSections()
	{
		if(!modifySectionsClickInProgress) 
		{
			modifySectionsClickInProgress = true;
			view.getModifySectionsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseSectionId = null;
			Integer course = null;
			Integer sectionType = null;
			String term = null;
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseSectionId = Integer.parseInt(view.getCourseSectionIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_SECTION_ID);
				fieldsAreValid = false;
			}
			try
			{
				course = Integer.parseInt(view.getCourseTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_COURSE);
				fieldsAreValid = false;
			}
			try
			{
				sectionType = Integer.parseInt(view.getSectionTypeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_SECTION_TYPE);
				fieldsAreValid = false;
			}
			try
			{
				term = view.getTermIdTextBox().getText();
				checkEmptyString(term);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_TERM);
				fieldsAreValid = false;
			}
			
			
			if (fieldsAreValid) 
			{
				sendModifySections(courseSectionId, course, sectionType, term);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendModifySections(Integer courseSectionId, Integer course, Integer sectionType, String term) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionModifyAction sla = new CourseSectionModifyAction(courseSectionId, course, sectionType, term);
		CourseSectionModifyEvent sle = new CourseSectionModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	@Override
	public void removeCourseSections()
	{
		if(!removeSectionsClickInProgress) 
		{
			removeSectionsClickInProgress = true;
			view.getRemoveSectionsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer courseSectionId = null;
			
			boolean fieldsAreValid = true;
			List<String> invalidReasonList = new ArrayList<>();
			try
			{
				courseSectionId = Integer.parseInt(view.getCourseSectionIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidSectionStrings.NULL_SECTION_ID);
				fieldsAreValid = false;
			}			
			
			if (fieldsAreValid) 
			{
				sendRemoveSections(courseSectionId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveSections(Integer courseSectionId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		CourseSectionRemoveAction sla = new CourseSectionRemoveAction(courseSectionId);
		CourseSectionRemoveEvent sle = new CourseSectionRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void addLocations()
	{
	
		if(!addLocationClickInProgress) 
		{
			addLocationClickInProgress = true;
			view.getAddLocationsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
		    Integer room = null;
		    Integer roomSize = null;
		    String building = view.getBuildingTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(building);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_BUILDING);
				fieldsAreValid = false;
			}
			
			try
			{
				room = Integer.parseInt(view.getRoomTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_ROOM);
				fieldsAreValid = false;
			}
			
			try
			{
				roomSize = Integer.parseInt(view.getRoomSizeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_ROOM_SIZE);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendAddLocations(building, room, roomSize);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddLocations(String building, Integer room, Integer roomSize) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		LocationAddAction sla = new LocationAddAction(building, room, roomSize);
		LocationAddEvent sle = new LocationAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	
	@Override
	public void modifyLocations()
	{
	
		if(!modifyLocationClickInProgress) 
		{
			modifyLocationClickInProgress = true;
			view.getModifyLocationsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer locationId = null;
		    Integer room = null;
		    Integer roomSize = null;
		    String building = view.getBuildingTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(building);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_BUILDING);
				fieldsAreValid = false;
			}
			
			try
			{
				locationId = Integer.parseInt(view.getLocationIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_LOCATION_ID);
				fieldsAreValid = false;
			}
			
			try
			{
				room = Integer.parseInt(view.getRoomTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_ROOM);
				fieldsAreValid = false;
			}
			
			try
			{
				roomSize = Integer.parseInt(view.getRoomSizeTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_ROOM_SIZE);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendModifyLocations(locationId, building, room, roomSize);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendModifyLocations(Integer locationId, String building, Integer room, Integer roomSize) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		LocationModifyAction sla = new LocationModifyAction(locationId, building, room, roomSize);
		LocationModifyEvent sle = new LocationModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void removeLocations()
	{
	
		if(!removeLocationClickInProgress) 
		{
			removeLocationClickInProgress = true;
			view.getRemoveLocationsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer locationId = null;
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				locationId = Integer.parseInt(view.getLocationIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidLocationStrings.INVALID_LOCATION_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendRemoveLocations(locationId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveLocations(Integer locationId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		LocationRemoveAction sla = new LocationRemoveAction(locationId);
		LocationRemoveEvent sle = new LocationRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void addDepartments()
	{
	
		if(!addDepartmentClickInProgress) 
		{
			addDepartmentClickInProgress = true;
			view.getAddDepartmentsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
		    String department = view.getDepartmentTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(department);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidDepartmentStrings.INVALID_DEPARTMENT);
				fieldsAreValid = false;
			}
			
			
			if (fieldsAreValid) 
			{
				sendAddDepartments(department);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddDepartments(String department) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		DepartmentAddAction sla = new DepartmentAddAction(department);
		DepartmentAddEvent sle = new DepartmentAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void modifyDepartments()
	{
	
		if(!modifyDepartmentClickInProgress) 
		{
			modifyDepartmentClickInProgress = true;
			view.getModifyDepartmentsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer departmentId = null;
		    String department = view.getDepartmentTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(department);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidDepartmentStrings.INVALID_DEPARTMENT);
				fieldsAreValid = false;
			}
			
			try
			{
				departmentId = Integer.parseInt(view.getDepartmentIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidDepartmentStrings.INVALID_DEPARTMENT_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendModifyDepartments(departmentId, department);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendModifyDepartments(Integer departmentId, String department) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		DepartmentModifyAction sla = new DepartmentModifyAction(departmentId, department);
		DepartmentModifyEvent sle = new DepartmentModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void removeDepartments()
	{
	
		if(!removeDepartmentClickInProgress) 
		{
			removeDepartmentClickInProgress = true;
			view.getRemoveDepartmentsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer departmentId = null;
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				departmentId = Integer.parseInt(view.getDepartmentIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidDepartmentStrings.INVALID_DEPARTMENT_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendRemoveDepartments(departmentId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveDepartments(Integer departmentId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		DepartmentRemoveAction sla = new DepartmentRemoveAction(departmentId);
		DepartmentRemoveEvent sle = new DepartmentRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void addTerms()
	{
	
		if(!addTermClickInProgress) 
		{
			addTermClickInProgress = true;
			view.getAddTermsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
		    String termName = view.getTermNameTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(termName);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidTermStrings.INVALID_TERM_NAME);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendAddTerms(termName);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendAddTerms(String termName) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		TermAddAction sla = new TermAddAction(termName);
		TermAddEvent sle = new TermAddEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void modifyTerms()
	{
	
		if(!modifyTermClickInProgress) 
		{
			modifyTermClickInProgress = true;
			view.getModifyTermsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer termId = null;
		    String termName = view.getTermNameTextBox().getText();
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				checkEmptyString(termName);
			}
			catch(EmptyStringException e) 
			{
				invalidReasonList.add(InvalidTermStrings.INVALID_TERM_NAME);
				fieldsAreValid = false;
			}
			
			try
			{
				termId = Integer.parseInt(view.getTermIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTermStrings.INVALID_TERM_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendModifyTerms(termId, termName);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendModifyTerms(Integer termId, String termName) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		TermModifyAction sla = new TermModifyAction(termId, termName);
		TermModifyEvent sle = new TermModifyEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void removeTerms()
	{
	
		if(!removeTermClickInProgress) 
		{
			removeTermClickInProgress = true;
			view.getRemoveTermsButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			Integer termId = null;
			
			boolean fieldsAreValid = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				termId = Integer.parseInt(view.getTermIdTextBox().getText());
			}
			catch(NumberFormatException e)
			{
				invalidReasonList.add(InvalidTermStrings.INVALID_TERM_ID);
				fieldsAreValid = false;
			}
			
			if (fieldsAreValid) 
			{
				sendRemoveTerms(termId);
			}
			else
			{
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		}
	}
	
	public void sendRemoveTerms(Integer termId) 
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		TermRemoveAction sla = new TermRemoveAction(termId);
		TermRemoveEvent sle = new TermRemoveEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void confirmRequest()
	{
		//Haven't implemented this yet
	}
	
	@Override
	public void onInvalidField(InvalidFieldEvent evt)
	{
		parentPresenter.hideLoadScreen();
		view.getAddCoursesButton().setEnabled(true);
		view.getModifyCoursesButton().setEnabled(true);
		view.getRemoveCoursesButton().setEnabled(true);
		view.getAddSectionsButton().setEnabled(true);
		view.getModifySectionsButton().setEnabled(true);
		view.getRemoveSectionsButton().setEnabled(true);
		view.getAddCourseSectionTimesButton().setEnabled(true);
		view.getModifyCourseSectionTimesButton().setEnabled(true);
		view.getRemoveCourseSectionTimesButton().setEnabled(true);
		view.getAddLocationsButton().setEnabled(true);
		view.getModifyLocationsButton().setEnabled(true);
		view.getRemoveLocationsButton().setEnabled(true);
		view.getAddDepartmentsButton().setEnabled(true);
		view.getModifyDepartmentsButton().setEnabled(true);
		view.getRemoveDepartmentsButton().setEnabled(true);
		view.getAddTermsButton().setEnabled(true);
		view.getModifyTermsButton().setEnabled(true);
		view.getRemoveTermsButton().setEnabled(true);
		view.getConfirmRequestButton().setEnabled(true);
		addCourseClickInProgress = false;
		modifyCourseClickInProgress = false;
		removeCourseClickInProgress = false;
		addSectionsClickInProgress = false;
		modifySectionsClickInProgress = false;
		removeSectionsClickInProgress = false;
		addTimeClickInProgress = false;
		modifyTimeClickInProgress = false;
		removeTimeClickInProgress = false;
		addLocationClickInProgress = false;
		modifyLocationClickInProgress = false;
		removeLocationClickInProgress = false;
		addDepartmentClickInProgress = false;
		modifyDepartmentClickInProgress = false;
		removeDepartmentClickInProgress = false;
		addTermClickInProgress = false;
		modifyTermClickInProgress = false;
		removeTermClickInProgress = false;
		
		
		InvalidFieldAction ila = evt.getAction();
		view.showErrorMessages(ila.toString());
	}
}
