package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidCourseStrings;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.CourseAddEvent;
import org.dselent.course_load_scheduler.client.event.UnrequestEvent;
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

/* Created by Michael Capobianco */

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
	public void AddCourses()
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
		CourseAddAction sla = new CourseAddAction(courseName, courseDept, courseDescription);
		CourseAddEvent sle = new CourseAddEvent(sla);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void ModifyCourses()
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
		CourseModifyAction sla = new CourseModifyAction(courseId, courseName, courseDept, courseDescription);
		CourseModifyEvent sle = new CourseModifyEvent(sla);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void RemoveCourses()
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
		CourseRemoveAction sla = new CourseRemoveAction(courseId);
		CourseRemoveEvent sle = new CourseRemoveEvent(sla);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void AddCourseSectionTimes()
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
		CourseSectionTimeAddAction sla = new CourseSectionTimeAddAction(courseSectionId, dayOfWeek, startTime, endTime, location);
		CourseSectionTimeAddEvent sle = new CourseSectionTimeAddEvent(sla);
		eventBus.fireEvent(sle);
	}
	
	
	@Override
	public void ModifyCourseSectionTimes()
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
		CourseSectionTimeModifyAction sla = new CourseSectionTimeModifyAction(courseSectionTimeId, courseSectionId, dayOfWeek, startTime, endTime, location);
		CourseSectionTimeModifyEvent sle = new CourseSectionTimeModifyEvent(sla);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void RemoveCourseSectionTimes()
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
		CourseSectionTimeRemoveAction sla = new CourseSectionTimeRemoveAction(courseSectionTimeId);
		CourseSectionTimeRemoveEvent sle = new CourseSectionTimeRemoveEvent(sla);
		eventBus.fireEvent(sle);
	}
	
}
