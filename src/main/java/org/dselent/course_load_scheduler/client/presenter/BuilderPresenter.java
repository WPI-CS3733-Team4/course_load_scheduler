package org.dselent.course_load_scheduler.client.presenter;

public interface BuilderPresenter extends BasePresenter{

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void addCourses();
	void modifyCourses();
	void removeCourses();
	void addCourseSections();
	void modifyCourseSections();
	void removeCourseSections();
	void addCourseSectionTimes();
	void modifyCourseSectionTimes();
	void removeCourseSectionTimes();
	void addLocations();
	void modifyLocations();
	void removeLocations();
	void addDepartments();
	void modifyDepartments();
	void removeDepartments();
	void addTerms();
	void modifyTerms();
	void removeTerms();
	void confirmRequest();
	
}
