package org.dselent.course_load_scheduler.client.network;

public final class NetworkRequestStrings
{
	//	public static final String SERVER_LOCATION = "http://localhost:8081/";
	public static final String SERVER_LOCATION = "https://20180226t030941-dot-softenggroup4.appspot.com/";
	public static final String BASE_REQUEST = "";
	
	public static String LOGIN = "user/login";
	public static String USER_ADD = "user/register";
	public static String USER_MODIFY = "user/modify";
	public static String USER_REMOVE = "user/deactivate";
	public static String LOGOUT = "user/logout";
	
	public static String USER_PERMISSION_MODIFY = "admin/changeUserRole";
	
	public static String TERM_ADD = "term/add";
	public static String TERM_MODIFY = "term/modify";
	public static String TERM_REMOVE = "term/remove";
	
	public static String LOCATION_ADD = "location/add";
	public static String LOCATION_MODIFY = "location/modify";
	public static String LOCATION_REMOVE = "location/remove";
	
	public static String FACULTY_ADD = "faculty/add";
	public static String FACULTY_MODIFY = "faculty/modify";
	public static String FACULTY_REMOVE = "faculty/remove";
	
	public static String DEPARTMENT_ADD = "department/add";
	public static String DEPARTMENT_MODIFY = "department/modify";
	public static String DEPARTMENT_REMOVE = "department/remove";
	
	public static String COURSE_SECTION_TIMES_ADD = "courseSectionTime/add";
	public static String COURSE_SECTION_TIMES_MODIFY = "courseSectionTime/modify";
	public static String COURSE_SECTION_TIMES_REMOVE = "courseSectionTime/remove";
	
	public static String COURSE_SECTION_ADD = "courseSection/add";
	public static String COURSE_SECTION_MODIFY = "courseSection/modify";
	public static String COURSE_SECTION_REMOVE = "courseSection/remove";
	
	public static String COURSE_ADD = "course/add";
	public static String COURSE_MODIFY = "course/modify";
	public static String COURSE_REMOVE = "course/remove";
	
	public static String COURSE_REQUEST_ADD = "courseRequests/add";
	public static String COURSE_REQUEST_MODIFY = "courseRequests/modify";
	public static String COURSE_REQUEST_REMOVE = "courseRequests/remove";
	
	public static String COURSE_DEPARTMENT_ADD = "courseDepartments/add";
	public static String COURSE_DEPARTMENT_REMOVE = "courseDepartments/modify";
	public static String COURSE_DEPARTMENT_MODIFY = "courseDepartments/remove";
	
	private NetworkRequestStrings() {};
}
