package org.dselent.course_load_scheduler.client.service.impl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

import org.dselent.course_load_scheduler.client.action.CourseAddAction;
import org.dselent.course_load_scheduler.client.action.CourseModifyAction;
import org.dselent.course_load_scheduler.client.action.CourseRemoveAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionAddAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionModifyAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionRemoveAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeAddAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeModifyAction;
import org.dselent.course_load_scheduler.client.action.CourseSectionTimeRemoveAction;
import org.dselent.course_load_scheduler.client.action.DepartmentAddAction;
import org.dselent.course_load_scheduler.client.action.DepartmentModifyAction;
import org.dselent.course_load_scheduler.client.action.DepartmentRemoveAction;
import org.dselent.course_load_scheduler.client.action.LocationAddAction;
import org.dselent.course_load_scheduler.client.action.LocationModifyAction;
import org.dselent.course_load_scheduler.client.action.LocationRemoveAction;
import org.dselent.course_load_scheduler.client.action.TermAddAction;
import org.dselent.course_load_scheduler.client.action.TermModifyAction;
import org.dselent.course_load_scheduler.client.action.TermRemoveAction;
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
import org.dselent.course_load_scheduler.client.translator.impl.CourseModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionTimeAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionTimeModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSectionTimeRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.DepartmentAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.DepartmentModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.DepartmentRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.LocationAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.LocationModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.LocationRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.TermAddActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.TermModifyActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.TermRemoveActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UserAddActionTranslatorImpl;

/* Created by Nathan Siegel */

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
	
	@Override
	public void onCourseModify(CourseModifyEvent evt)
	{
		CourseModifyAction action = evt.getAction();
		CourseModifyActionTranslatorImpl courseModifyActionTranslator = new CourseModifyActionTranslatorImpl();
		JSONObject json = courseModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseRemove(CourseRemoveEvent evt)
	{
		CourseRemoveAction action = evt.getAction();
		CourseRemoveActionTranslatorImpl courseRemoveActionTranslator = new CourseRemoveActionTranslatorImpl();
		JSONObject json = courseRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionAdd(CourseSectionAddEvent evt)
	{
		CourseSectionAddAction action = evt.getAction();
		CourseSectionAddActionTranslatorImpl courseSectionAddActionTranslator = new CourseSectionAddActionTranslatorImpl();
		JSONObject json = courseSectionAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionModify(CourseSectionModifyEvent evt)
	{
		CourseSectionModifyAction action = evt.getAction();
		CourseSectionModifyActionTranslatorImpl courseSectionModifyActionTranslator = new CourseSectionModifyActionTranslatorImpl();
		JSONObject json = courseSectionModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionRemove(CourseSectionRemoveEvent evt)
	{
		CourseSectionRemoveAction action = evt.getAction();
		CourseSectionRemoveActionTranslatorImpl courseSectionRemoveActionTranslator = new CourseSectionRemoveActionTranslatorImpl();
		JSONObject json = courseSectionRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeAdd(CourseSectionTimeAddEvent evt)
	{
		CourseSectionTimeAddAction action = evt.getAction();
		CourseSectionTimeAddActionTranslatorImpl courseSectionTimeAddActionTranslator = new CourseSectionTimeAddActionTranslatorImpl();
		JSONObject json = courseSectionTimeAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeModify(CourseSectionTimeModifyEvent evt)
	{
		CourseSectionTimeModifyAction action = evt.getAction();
		CourseSectionTimeModifyActionTranslatorImpl courseSectionTimeModifyActionTranslator = new CourseSectionTimeModifyActionTranslatorImpl();
		JSONObject json = courseSectionTimeModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeRemove(CourseSectionTimeRemoveEvent evt)
	{
		CourseSectionTimeRemoveAction action = evt.getAction();
		CourseSectionTimeRemoveActionTranslatorImpl courseSectionTimeRemoveActionTranslator = new CourseSectionTimeRemoveActionTranslatorImpl();
		JSONObject json = courseSectionTimeRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationAdd(LocationAddEvent evt)
	{
		LocationAddAction action = evt.getAction();
		LocationAddActionTranslatorImpl locationAddActionTranslator = new LocationAddActionTranslatorImpl();
		JSONObject json = locationAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationModify(LocationModifyEvent evt)
	{
		LocationModifyAction action = evt.getAction();
		LocationModifyActionTranslatorImpl locationModifyActionTranslator = new LocationModifyActionTranslatorImpl();
		JSONObject json = locationModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationRemove(LocationRemoveEvent evt)
	{
		LocationRemoveAction action = evt.getAction();
		LocationRemoveActionTranslatorImpl locationRemoveActionTranslator = new LocationRemoveActionTranslatorImpl();
		JSONObject json = locationRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentAdd(DepartmentAddEvent evt)
	{
		DepartmentAddAction action = evt.getAction();
		DepartmentAddActionTranslatorImpl departmentAddActionTranslator = new DepartmentAddActionTranslatorImpl();
		JSONObject json = departmentAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentModify(DepartmentModifyEvent evt)
	{
		DepartmentModifyAction action = evt.getAction();
		DepartmentModifyActionTranslatorImpl departmentModifyActionTranslator = new DepartmentModifyActionTranslatorImpl();
		JSONObject json = departmentModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentRemove(DepartmentRemoveEvent evt)
	{
		DepartmentRemoveAction action = evt.getAction();
		DepartmentRemoveActionTranslatorImpl departmentRemoveActionTranslator = new DepartmentRemoveActionTranslatorImpl();
		JSONObject json = departmentRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onTermAdd(TermAddEvent evt)
	{
		TermAddAction action = evt.getAction();
		TermAddActionTranslatorImpl termAddActionTranslator = new TermAddActionTranslatorImpl();
		JSONObject json = termAddActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onTermModify(TermModifyEvent evt)
	{
		TermModifyAction action = evt.getAction();
		TermModifyActionTranslatorImpl termModifyActionTranslator = new TermModifyActionTranslatorImpl();
		JSONObject json = termModifyActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
	
	@Override
	public void onTermRemove(TermRemoveEvent evt)
	{
		TermRemoveAction action = evt.getAction();
		TermRemoveActionTranslatorImpl termRemoveActionTranslator = new TermRemoveActionTranslatorImpl();
		JSONObject json = termRemoveActionTranslator.translateToJson(action);
		FacultyCallback facultyCallback = new FacultyCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, facultyCallback, json);
		request.send();
	}
}
