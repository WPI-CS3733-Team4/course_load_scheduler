package org.dselent.course_load_scheduler.client.service.impl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.callback.FacultyCallback;
import org.dselent.course_load_scheduler.client.event.CourseAddEvent;
import org.dselent.course_load_scheduler.client.event.CourseModifyEvent;
import org.dselent.course_load_scheduler.client.event.CourseRemoveEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionAddEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionModifyEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionRemoveEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeAddEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeModifyEvent;
import org.dselent.course_load_scheduler.client.event.CourseSectionTimeRemoveEvent;
import org.dselent.course_load_scheduler.client.event.DepartmentAddEvent;
import org.dselent.course_load_scheduler.client.event.DepartmentModifyEvent;
import org.dselent.course_load_scheduler.client.event.DepartmentRemoveEvent;
import org.dselent.course_load_scheduler.client.event.LocationAddEvent;
import org.dselent.course_load_scheduler.client.event.LocationModifyEvent;
import org.dselent.course_load_scheduler.client.event.LocationRemoveEvent;
import org.dselent.course_load_scheduler.client.event.TermAddEvent;
import org.dselent.course_load_scheduler.client.event.TermModifyEvent;
import org.dselent.course_load_scheduler.client.event.TermRemoveEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.BuilderService;
import org.dselent.course_load_scheduler.client.translator.impl.CourseAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UserAddActionTranslatorImpl;

public class BuilderServiceImpl extends BaseServiceImpl implements BuilderService
{
	public BuilderServiceImpl()
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
		eventBusRegistration.put(CourseAddEvent.TYPE, eventBus.addHandler(CourseAddEvent.TYPE, this));
		eventBusRegistration.put(CourseModifyEvent.TYPE, eventBus.addHandler(CourseModifyEvent.TYPE, this));
		eventBusRegistration.put(CourseRemoveEvent.TYPE, eventBus.addHandler(CourseRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(CourseSectionAddEvent.TYPE, eventBus.addHandler(CourseSectionAddEvent.TYPE, this));
		eventBusRegistration.put(CourseSectionModifyEvent.TYPE, eventBus.addHandler(CourseSectionModifyEvent.TYPE, this));
		eventBusRegistration.put(CourseSectionRemoveEvent.TYPE, eventBus.addHandler(CourseSectionRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(CourseSectionTimeAddEvent.TYPE, eventBus.addHandler(CourseSectionTimeAddEvent.TYPE, this));
		eventBusRegistration.put(CourseSectionTimeModifyEvent.TYPE, eventBus.addHandler(CourseSectionTimeModifyEvent.TYPE, this));
		eventBusRegistration.put(CourseSectionTimeRemoveEvent.TYPE, eventBus.addHandler(CourseSectionTimeRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(LocationAddEvent.TYPE, eventBus.addHandler(LocationAddEvent.TYPE, this));
		eventBusRegistration.put(LocationModifyEvent.TYPE, eventBus.addHandler(LocationModifyEvent.TYPE, this));
		eventBusRegistration.put(LocationRemoveEvent.TYPE, eventBus.addHandler(LocationRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(DepartmentAddEvent.TYPE, eventBus.addHandler(DepartmentAddEvent.TYPE, this));
		eventBusRegistration.put(DepartmentModifyEvent.TYPE, eventBus.addHandler(DepartmentModifyEvent.TYPE, this));
		eventBusRegistration.put(DepartmentRemoveEvent.TYPE, eventBus.addHandler(DepartmentRemoveEvent.TYPE, this));
		
		eventBusRegistration.put(TermAddEvent.TYPE, eventBus.addHandler(TermAddEvent.TYPE, this));
		eventBusRegistration.put(TermModifyEvent.TYPE, eventBus.addHandler(TermModifyEvent.TYPE, this));
		eventBusRegistration.put(TermRemoveEvent.TYPE, eventBus.addHandler(TermRemoveEvent.TYPE, this));
		
	}
	
	@Override
	public void onCourseAdd(CourseAddEvent evt)
	{
		CourseAddAction action = evt.getAction();
		CourseAddActionTranslatorImpl courseAddActionTranslator = new CourseAddActionTranslatorImpl();
		JSONObject json = courseAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
}
