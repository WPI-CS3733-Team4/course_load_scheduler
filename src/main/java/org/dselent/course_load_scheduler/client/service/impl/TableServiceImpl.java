package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.event.SendCourseSectionsEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseTimesEvent;
import org.dselent.course_load_scheduler.client.event.SendCoursesEvent;
import org.dselent.course_load_scheduler.client.event.SendDepartmentEvent;
import org.dselent.course_load_scheduler.client.event.SendLocationsEvent;
import org.dselent.course_load_scheduler.client.event.SendTermsEvent;
import org.dselent.course_load_scheduler.client.event.SendUserRolesEvent;
import org.dselent.course_load_scheduler.client.event.SendUsersEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.TableService;


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
		eventBusRegistration.put(SendDepartmentEvent.TYPE, eventBus.addHandler(SendDepartmentEvent.TYPE, this));
		eventBusRegistration.put(SendTermsEvent.TYPE, eventBus.addHandler(SendTermsEvent.TYPE, this));
		eventBusRegistration.put(SendCourseTimesEvent.TYPE, eventBus.addHandler(SendCourseTimesEvent.TYPE, this));
		eventBusRegistration.put(SendCoursesEvent.TYPE, eventBus.addHandler(SendCourseRsEvent.TYPE, this));
		
		
		
	}
	
	
}
