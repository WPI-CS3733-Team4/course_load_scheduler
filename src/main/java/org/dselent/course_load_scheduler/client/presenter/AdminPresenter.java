package org.dselent.course_load_scheduler.client.presenter;

public interface AdminPresenter extends BasePresenter {

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void changeUserRoles();
	void confirmUser();
	void AddUsers();
	void ModifyUsers();
	void RemoveUsers();
	void AddRoles();
	void ModifyRoles();
	void RemoveRoles();
}




