package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveUserRolesAction extends Action{

	private List<User> listOfUserRoles;
	
	public ReceiveUserRolesAction(List<User> listOfUserRoles) {
		this.listOfUserRoles = listOfUserRoles;
	}

	public List<User> getListOfUserRoles() {
		return listOfUserRoles;
	}

	@Override
	public String toString() {
		return "ReceiveUserRolesAction [listOfUserRoles=" + listOfUserRoles + "]";
	}

	
	
	
}
