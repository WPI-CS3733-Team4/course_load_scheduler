package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.event.SendCourseSectionsEvent;
import org.dselent.course_load_scheduler.client.event.SendCoursesEvent;

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
	}
	
	
}
