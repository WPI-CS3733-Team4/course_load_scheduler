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
implements UserRemoveEventHandler, UserModifyEventHandler, UserAddEventHandler, UnrequestEventHandler, TermRemoveEventHandler, TermModifyEventHandler,
		TermAddEventHandler, SendLogoutEventHandler, SendLoginEventHandler, RequestEventHandler, LocationRemoveEventHandler,
		LocationModifyEventHandler, LocationAddEventHandler, InvalidFieldEventHandler, FacultyRemoveEventHandler, FacultyModifyEventHandler,
		FacultyAddEventHandler, DepartmentRemoveEventHandler, DepartmentModifyEventHandler, DepartmentAddEventHandler, CourseSectionTimeRemoveEventHandler,
		CourseSectionTimeModifyEventHandler, CourseSectionTimeAddEventHandler, CourseSectionRemoveEventHandler, CourseSectionModifyEventHandler, 
		CourseSectionAddEventHandler, CourseRemoveEventHandler, CourseModifyEventHandler, CourseDepartmentRemoveEventHandler, CourseDepartmentModifyEventHandler,
		CourseDepartmentAddEventHandler, CourseAddEventHandler, ConfirmUserEventHandler, ChangeRoleEventHandler, ReceiveLoginEventHandler, UserRegisterEventHandler, 
		ReceiveCourseRequestsEventHandler, ReceiveCourseSectionsEventHandler, ReceiveCoursesEventHandler, ReceiveCourseTimesEventHandler, ReceiveLocationsEventHandler,
		ReceiveTermsEventHandler, ReceiveUserRolesEventHandler, ReceiveUsersEventHandler, ReceiveDepartmentsEventHandler, SendCourseRequestsEventHandler,
		SendCourseSectionsEventHandler, SendCoursesEventHandler, SendCourseTimesEventHandler, SendLocationsEventHandler,
		SendTermsEventHandler, SendUserRolesEventHandler, SendUsersEventHandler, SendDepartmentsEventHandler
{

	@Override
	public void onUserRemove(UserRemoveEvent evt) {}

	@Override
	public void onUserModify(UserModifyEvent evt) {}

	@Override
	public void onUserAdd(UserAddEvent evt) {}
	
	@Override
	public void onUnrequest(UnrequestEvent evt) {}

	@Override
	public void onTermRemove(TermRemoveEvent evt) {}

	@Override
	public void onTermModify(TermModifyEvent evt) {}

	@Override
	public void onTermAdd(TermAddEvent evt) {}

	@Override
	public void onSendLogout(SendLogoutEvent evt) {}

	@Override
	public void onSendLogin(SendLoginEvent evt) {}
	
	@Override
	public void onRequest(RequestEvent evt) {}

	@Override
	public void onLocationRemove(LocationRemoveEvent evt) {}

	@Override
	public void onLocationModify(LocationModifyEvent evt) {}

	@Override
	public void onLocationAdd(LocationAddEvent evt) {}

	@Override
	public void onInvalidField(InvalidFieldEvent evt) {}

	@Override
	public void onFacultyRemove(FacultyRemoveEvent evt) {}

	@Override
	public void onFacultyModify(FacultyModifyEvent evt) {}

	@Override
	public void onFacultyAdd(FacultyAddEvent evt) {}
	
	@Override
	public void onDepartmentRemove(DepartmentRemoveEvent evt) {}

	@Override
	public void onDepartmentModify(DepartmentModifyEvent evt) {}

	@Override
	public void onDepartmentAdd(DepartmentAddEvent evt)  {}
	
	@Override
	public void onCourseSectionTimeRemove(CourseSectionTimeRemoveEvent evt) {}
	
	@Override
	public void onCourseSectionTimeModify(CourseSectionTimeModifyEvent evt) {}
	
	@Override
	public void onCourseSectionTimeAdd(CourseSectionTimeAddEvent evt) {}
	
	@Override
	public void onCourseSectionRemove(CourseSectionRemoveEvent evt) {}
	
	@Override
	public void onCourseSectionModify(CourseSectionModifyEvent evt) {}
	
	@Override
	public void onCourseSectionAdd(CourseSectionAddEvent evt) {
	}
	
	@Override
	public void onCourseRemove(CourseRemoveEvent evt) {}
	
	@Override
	public void onCourseModify(CourseModifyEvent evt) {}

	@Override
	public void onCourseDepartmentRemove(CourseDepartmentRemoveEvent evt) {}
	
	@Override
	public void onCourseDepartmentModify(CourseDepartmentModifyEvent evt) {}
	
	
	@Override
	public void onCourseDepartmentAdd(CourseDepartmentAddEvent evt) {}

	@Override
	public void onCourseAdd(CourseAddEvent evt) {}

	@Override
	public void onConfirmUser(ConfirmUserEvent evt) {}

	@Override
	public void onChangeRole(ChangeRoleEvent evt) {}

	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {}
	
	@Override
	public void onUserRegister(UserRegisterEvent evt) {}
	
	@Override
	public void onReceiveCourseRequests(ReceiveCourseRequestsEvent evt) {}
	
	@Override
	public void onReceiveCourseSections(ReceiveCourseSectionsEvent evt) {}
	
	@Override
	public void onReceiveCourses(ReceiveCoursesEvent evt) {}
	
	@Override
	public void onReceiveDepartments(ReceiveDepartmentsEvent evt) {}
	
	@Override
	public void onReceiveLocations(ReceiveLocationsEvent evt) {}
	
	@Override
	public void onReceiveTerms(ReceiveTermsEvent evt) {}
	
	@Override
	public void onReceiveUserRoles(ReceiveUserRolesEvent evt) {}
	
	@Override
	public void onReceiveUsers(ReceiveUsersEvent evt) {}
	
	@Override
	public void onReceiveCourseTimes(ReceiveCourseTimesEvent evt) {}
	
	//send
	
	@Override
	public void onSendCourseRequests(SendCourseRequestsEvent evt) {}
	
	@Override
	public void onSendCourseSections(SendCourseSectionsEvent evt) {}
	
	@Override
	public void onSendCourses(SendCoursesEvent evt) {}
	
	@Override
	public void onSendDepartments(SendDepartmentsEvent evt) {}
	
	@Override
	public void onSendLocations(SendLocationsEvent evt) {}
	
	@Override
	public void onSendTerms(SendTermsEvent evt) {}
	
	@Override
	public void onSendUserRoles(SendUserRolesEvent evt) {}
	
	@Override
	public void onSendUsers(SendUsersEvent evt) {}
	
	@Override
	public void onSendCourseTimes(SendCourseTimesEvent evt) {}
	

}
