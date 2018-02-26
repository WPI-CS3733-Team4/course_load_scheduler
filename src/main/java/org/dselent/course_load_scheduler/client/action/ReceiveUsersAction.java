package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveUsersAction extends Action{

	private List<User> listOfUsers;
	
	public ReceiveUsersAction(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}

	public List<User> getListOfUsers() {
		return listOfUsers;
	}

	@Override
	public String toString() {
		return "ReceiveUsersAction [listOfUsers=" + listOfUsers + "]";
	}

	
	
	
}
