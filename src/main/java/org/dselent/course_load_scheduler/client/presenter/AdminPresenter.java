package org.dselent.course_load_scheduler.client.presenter;

/* Created by Krishna Madhurkar */
public interface AdminPresenter extends BasePresenter {

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	//void confirmUser();
	void addUser();
	void modifyUser();
	void removeUser();
	void changeRole;
}




