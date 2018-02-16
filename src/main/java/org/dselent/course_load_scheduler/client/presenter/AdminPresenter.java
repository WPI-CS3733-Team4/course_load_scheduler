package org.dselent.course_load_scheduler.client.presenter;

/* Created by Krishna Madhurkar */
public interface AdminPresenter extends BasePresenter {

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	//void confirmUser();
	void AddUser();
	void ModifyUser();
	void RemoveUser();
	void AddRole();
	void ModifyRole();
	void RemoveRole();
}




