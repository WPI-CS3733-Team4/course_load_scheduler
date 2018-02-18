package org.dselent.course_load_scheduler.client.presenter;

public interface BuilderPresenter extends BasePresenter{

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void AddCourses();
	void ModifyCourses();
	void RemoveCourses();
	void AddSections();
	void ModifySections();
	void RemoveSections();
	void AddCourseSectionTimes();
	void ModifyCourseSectionTimes();
	void RemoveCourseSectionTimes();
	void AddLocations();
	void ModifyLocations();
	void RemoveLocations();
	void AddDepartments();
	void ModifyDepartments();
	void RemoveDepartments();
	void AddTerms();
	void ModifyTerms();
	void RemoveTerms();
	void ComfirmRequest();
	
}
