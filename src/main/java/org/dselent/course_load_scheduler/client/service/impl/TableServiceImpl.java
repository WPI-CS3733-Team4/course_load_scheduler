package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendCoursesAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.callback.SendCourseRequestsCallback;
import org.dselent.course_load_scheduler.client.callback.SendCourseSectionsCallback;
import org.dselent.course_load_scheduler.client.callback.SendCourseTimesCallback;
import org.dselent.course_load_scheduler.client.callback.SendCoursesCallback;
import org.dselent.course_load_scheduler.client.callback.SendDepartmentsCallback;
import org.dselent.course_load_scheduler.client.callback.SendLocationsCallback;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.callback.SendTermsCallback;
import org.dselent.course_load_scheduler.client.callback.SendUserRolesCallback;
import org.dselent.course_load_scheduler.client.callback.SendUsersCallback;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseRequestsEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseSectionsEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseTimesEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCoursesEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveDepartmentsEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLocationsEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveTermsEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveUserRolesEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveUsersEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseRequestsEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseSectionsEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseTimesEvent;
import org.dselent.course_load_scheduler.client.event.SendCoursesEvent;
import org.dselent.course_load_scheduler.client.event.SendDepartmentsEvent;
import org.dselent.course_load_scheduler.client.event.SendLocationsEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendTermsEvent;
import org.dselent.course_load_scheduler.client.event.SendUserRolesEvent;
import org.dselent.course_load_scheduler.client.event.SendUsersEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.TableService;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.widgets.AdminDataWidget;
import org.dselent.course_load_scheduler.client.widgets.BuilderDataWidget;
import org.dselent.course_load_scheduler.client.widgets.FacultyDataWidget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;


/* Created by Nathan Siegel */

public class TableServiceImpl extends BaseServiceImpl implements TableService
{
	public TableServiceImpl()
	{
		
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		eventBusRegistration.put(SendCoursesEvent.TYPE, eventBus.addHandler(SendCoursesEvent.TYPE, this));
		eventBusRegistration.put(SendCourseSectionsEvent.TYPE, eventBus.addHandler(SendCourseSectionsEvent.TYPE, this));
		eventBusRegistration.put(SendUsersEvent.TYPE, eventBus.addHandler(SendUsersEvent.TYPE, this));
		eventBusRegistration.put(SendUserRolesEvent.TYPE, eventBus.addHandler(SendUserRolesEvent.TYPE, this));
		eventBusRegistration.put(SendLocationsEvent.TYPE, eventBus.addHandler(SendLocationsEvent.TYPE, this));
		eventBusRegistration.put(SendDepartmentsEvent.TYPE, eventBus.addHandler(SendDepartmentsEvent.TYPE, this));
		eventBusRegistration.put(SendTermsEvent.TYPE, eventBus.addHandler(SendTermsEvent.TYPE, this));
		eventBusRegistration.put(SendCourseTimesEvent.TYPE, eventBus.addHandler(SendCourseTimesEvent.TYPE, this));
		eventBusRegistration.put(SendCourseRequestsEvent.TYPE, eventBus.addHandler(SendCourseRequestsEvent.TYPE, this));
		
		eventBusRegistration.put(ReceiveCoursesEvent.TYPE, eventBus.addHandler(ReceiveCoursesEvent.TYPE, this));
		eventBusRegistration.put(ReceiveCourseSectionsEvent.TYPE, eventBus.addHandler(ReceiveCourseSectionsEvent.TYPE, this));
		eventBusRegistration.put(ReceiveUsersEvent.TYPE, eventBus.addHandler(ReceiveUsersEvent.TYPE, this));
		eventBusRegistration.put(ReceiveUserRolesEvent.TYPE, eventBus.addHandler(ReceiveUserRolesEvent.TYPE, this));
		eventBusRegistration.put(ReceiveLocationsEvent.TYPE, eventBus.addHandler(ReceiveLocationsEvent.TYPE, this));
		eventBusRegistration.put(ReceiveDepartmentsEvent.TYPE, eventBus.addHandler(ReceiveDepartmentsEvent.TYPE, this));
		eventBusRegistration.put(ReceiveTermsEvent.TYPE, eventBus.addHandler(ReceiveTermsEvent.TYPE, this));
		eventBusRegistration.put(ReceiveCourseTimesEvent.TYPE, eventBus.addHandler(ReceiveCourseTimesEvent.TYPE, this));
		eventBusRegistration.put(ReceiveCourseRequestsEvent.TYPE, eventBus.addHandler(ReceiveCourseRequestsEvent.TYPE, this));
		
		
		
	}
	
	@Override
	public void onSendCourses(SendCoursesEvent evt)
	{
		JSONObject json = new JSONObject();
		SendCoursesCallback coursesCallback = new SendCoursesCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRsequestStrings.SEND_COURSES, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendCourseSections(SendCourseSectionsEvent evt)
	{
		JSONObject json = new JSONObject();
		SendCourseSectionsCallback courseSectionsCallback = new SendCourseSectionsCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_COURSE_SECTIONS, courseSectionsCallback, json);
		request.send();
	}
	
	@Override
	public void onSendUsers(SendUsersEvent evt)
	{
		JSONObject json = new JSONObject();
		SendUsersCallback usersCallback = new SendUsersCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_USERS, usersCallback, json);
		request.send();
	}
	
	@Override
	public void onSendUserRoles(SendUserRolesEvent evt)
	{
		JSONObject json = new JSONObject();
		SendUserRolesCallback coursesCallback = new SendUserRolesCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_USER_ROLES, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendLocations(SendLocationsEvent evt)
	{
		JSONObject json = new JSONObject();
		SendLocationsCallback coursesCallback = new SendLocationsCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_LOCATIONS, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendDepartments(SendDepartmentsEvent evt)
	{
		JSONObject json = new JSONObject();
		SendDepartmentsCallback coursesCallback = new SendDepartmentsCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_DEPARTMENTS, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendTerms(SendTermsEvent evt)
	{
		JSONObject json = new JSONObject();
		SendTermsCallback coursesCallback = new SendTermsCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_TERMS, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendCourseTimes(SendCourseTimesEvent evt)
	{
		JSONObject json = new JSONObject();
		SendCourseTimesCallback coursesCallback = new SendCourseTimesCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_COURSE_TIMES, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onSendCourseRequests(SendCourseRequestsEvent evt)
	{
		JSONObject json = new JSONObject();
		SendCourseRequestsCallback coursesCallback = new SendCourseRequestsCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.SEND_COURSE_REQUESTS, coursesCallback, json);
		request.send();
	}
	
	@Override
	public void onReceiveCourses(ReceiveCoursesEvent evt)
	{
		//do stuff
		BuilderDataWidget.populateCourseTable(evt.getAction().getListOfCourses());
		FacultyDataWidget.populateCourse(evt.getAction().getListOfCourses());
	}
	
	@Override
	public void onReceiveCourseSections(ReceiveCourseSectionsEvent evt)
	{
		BuilderDataWidget.populateSectionTable(evt.getAction().getListOfCourseSections());
		FacultyDataWidget.populateSection(evt.getAction().getListOfCourseSections());
	}
	
	@Override
	public void onReceiveUsers(ReceiveUsersEvent evt)
	{
		//do stuff
		AdminDataWidget.populateUserTable(evt.getAction().getListOfUsers());
	}
	
	@Override
	public void onReceiveUserRoles(ReceiveUserRolesEvent evt)
	{
		//do stuff
		AdminDataWidget.populateUserPermissionTable(evt.getAction().getListOfUserRoles());
	}
	
	@Override
	public void onReceiveLocations(ReceiveLocationsEvent evt)
	{
		//do stuff
		BuilderDataWidget.populateLocationTable(evt.getAction().getListOfLocations());
	}
	
	@Override
	public void onReceiveDepartments(ReceiveDepartmentsEvent evt)
	{
		//do stuff
		BuilderDataWidget.populateDepartmentTable(evt.getAction().getListOfDepartments());
	}
	
	@Override
	public void onReceiveTerms(ReceiveTermsEvent evt)
	{
		//do stuff
		BuilderDataWidget.populateTermTable(evt.getAction().getListOfTerms());
	}
	
	@Override
	public void onReceiveCourseTimes(ReceiveCourseTimesEvent evt)
	{
		//do stuff
		BuilderDataWidget.populateTimeTable(evt.getAction().getListOfCourseTimes());
	}
	
	@Override
	public void onReceiveCourseRequests(ReceiveCourseRequestsEvent evt)
	{
		//do stuff
		//FacultyDataWidget.populateSection(evt.getAction().getListOfCourseRequests());
	}
}
