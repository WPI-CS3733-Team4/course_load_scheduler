package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.*;

/**
 * Adapter class for convenience
 * All classes that need to implement an event handler can extend from this class
 * This allows for presenters or other classes not to implement a large number of handler interfaces
 * Need to register all event handling functions with this class by implementing the handler and
 * overriding with an empty method
 * 
 * @author dselent
 * 
 */
public abstract class EventHandlerAdapter
implements SendLoginEventHandler, InvalidLoginEventHandler, DepartmentRemoveEventHandler, DepartmentModifyEventHandler, DepartmentAddEventHandler, CourseDepartmentAddEventHandler,
		CourseAddEventHandler, ConfirmUserEventHandler, ChangeRoleEventHandler
{

	@Override
	public void onSendLogin(SendLoginEvent evt) {}

	@Override
	public void onInvalidLogin(InvalidLoginEvent evt) {}
	
	@Override
	public void onDepartmentRemove(DepartmentRemoveEvent evt) {}

	@Override
	public void onDepartmentModify(DepartmentModifyEvent evt) {}

	@Override
	public void onDepartmentAdd(DepartmentAddEvent evt)  {}

	@Override
	public void onCourseDepartmentAdd(CourseDepartmentAddEvent evt) {}

	@Override
	public void onCourseAdd(CourseAddEvent evt) {}

	@Override
	public void onConfirmUser(ConfirmUserEvent evt) {}

	@Override
	public void onChangeRole(ChangeRoleEvent evt) {}



}
