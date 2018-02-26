package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendCoursesAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
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
import org.dselent.course_load_scheduler.client.event.SendDepartmentEvent;
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
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, coursesCallback, json);
		request.send();
	}
	
}
