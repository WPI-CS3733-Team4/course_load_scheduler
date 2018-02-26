package org.dselent.course_load_scheduler.client.service.impl;

import com.google.gwt.json.client.JSONObject;
import org.dselent.course_load_scheduler.client.action.*;
import org.dselent.course_load_scheduler.client.callback.BuilderCallback;
import org.dselent.course_load_scheduler.client.event.*;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.BuilderService;
import org.dselent.course_load_scheduler.client.translator.impl.*;

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
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseModify(CourseModifyEvent evt)
	{
		CourseModifyAction action = evt.getAction();
		CourseModifyActionTranslatorImpl courseModifyActionTranslator = new CourseModifyActionTranslatorImpl();
		JSONObject json = courseModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseRemove(CourseRemoveEvent evt)
	{
		CourseRemoveAction action = evt.getAction();
		CourseRemoveActionTranslatorImpl courseRemoveActionTranslator = new CourseRemoveActionTranslatorImpl();
		JSONObject json = courseRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_REMOVE, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionAdd(CourseSectionAddEvent evt)
	{
		CourseSectionAddAction action = evt.getAction();
		CourseSectionAddActionTranslatorImpl courseSectionAddActionTranslator = new CourseSectionAddActionTranslatorImpl();
		JSONObject json = courseSectionAddActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionModify(CourseSectionModifyEvent evt)
	{
		CourseSectionModifyAction action = evt.getAction();
		CourseSectionModifyActionTranslatorImpl courseSectionModifyActionTranslator = new CourseSectionModifyActionTranslatorImpl();
		JSONObject json = courseSectionModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionRemove(CourseSectionRemoveEvent evt)
	{
		CourseSectionRemoveAction action = evt.getAction();
		CourseSectionRemoveActionTranslatorImpl courseSectionRemoveActionTranslator = new CourseSectionRemoveActionTranslatorImpl();
		JSONObject json = courseSectionRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_REMOVE, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeAdd(CourseSectionTimeAddEvent evt)
	{
		CourseSectionTimeAddAction action = evt.getAction();
		CourseSectionTimeAddActionTranslatorImpl courseSectionTimeAddActionTranslator = new CourseSectionTimeAddActionTranslatorImpl();
		JSONObject json = courseSectionTimeAddActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_TIMES_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeModify(CourseSectionTimeModifyEvent evt)
	{
		CourseSectionTimeModifyAction action = evt.getAction();
		CourseSectionTimeModifyActionTranslatorImpl courseSectionTimeModifyActionTranslator = new CourseSectionTimeModifyActionTranslatorImpl();
		JSONObject json = courseSectionTimeModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_TIMES_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onCourseSectionTimeRemove(CourseSectionTimeRemoveEvent evt)
	{
		CourseSectionTimeRemoveAction action = evt.getAction();
		CourseSectionTimeRemoveActionTranslatorImpl courseSectionTimeRemoveActionTranslator = new CourseSectionTimeRemoveActionTranslatorImpl();
		JSONObject json = courseSectionTimeRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.COURSE_SECTION_TIMES_REMOVE, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationAdd(LocationAddEvent evt)
	{
		LocationAddAction action = evt.getAction();
		LocationAddActionTranslatorImpl locationAddActionTranslator = new LocationAddActionTranslatorImpl();
		JSONObject json = locationAddActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOCATION_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationModify(LocationModifyEvent evt)
	{
		LocationModifyAction action = evt.getAction();
		LocationModifyActionTranslatorImpl locationModifyActionTranslator = new LocationModifyActionTranslatorImpl();
		JSONObject json = locationModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOCATION_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onLocationRemove(LocationRemoveEvent evt)
	{
		LocationRemoveAction action = evt.getAction();
		LocationRemoveActionTranslatorImpl locationRemoveActionTranslator = new LocationRemoveActionTranslatorImpl();
		JSONObject json = locationRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOCATION_REMOVE, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentAdd(DepartmentAddEvent evt)
	{
		DepartmentAddAction action = evt.getAction();
		DepartmentAddActionTranslatorImpl departmentAddActionTranslator = new DepartmentAddActionTranslatorImpl();
		JSONObject json = departmentAddActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.DEPARTMENT_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentModify(DepartmentModifyEvent evt)
	{
		DepartmentModifyAction action = evt.getAction();
		DepartmentModifyActionTranslatorImpl departmentModifyActionTranslator = new DepartmentModifyActionTranslatorImpl();
		JSONObject json = departmentModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.DEPARTMENT_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onDepartmentRemove(DepartmentRemoveEvent evt)
	{
		DepartmentRemoveAction action = evt.getAction();
		DepartmentRemoveActionTranslatorImpl departmentRemoveActionTranslator = new DepartmentRemoveActionTranslatorImpl();
		JSONObject json = departmentRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.DEPARTMENT_REMOVE, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onTermAdd(TermAddEvent evt)
	{
		TermAddAction action = evt.getAction();
		TermAddActionTranslatorImpl termAddActionTranslator = new TermAddActionTranslatorImpl();
		JSONObject json = termAddActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.TERM_ADD, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onTermModify(TermModifyEvent evt)
	{
		TermModifyAction action = evt.getAction();
		TermModifyActionTranslatorImpl termModifyActionTranslator = new TermModifyActionTranslatorImpl();
		JSONObject json = termModifyActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.TERM_MODIFY, builderCallback, json);
		request.send();
	}
	
	@Override
	public void onTermRemove(TermRemoveEvent evt)
	{
		TermRemoveAction action = evt.getAction();
		TermRemoveActionTranslatorImpl termRemoveActionTranslator = new TermRemoveActionTranslatorImpl();
		JSONObject json = termRemoveActionTranslator.translateToJson(action);
		BuilderCallback builderCallback = new BuilderCallback(eventBus, evt.getContainer());
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.TERM_REMOVE, builderCallback, json);
		request.send();
	}

}
