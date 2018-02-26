package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.model.UserPermission;

public class ReceiveUserRolesAction extends Action{

	private List<UserPermission> listOfUserRoles;
	
	public ReceiveUserRolesAction(List<UserPermission> listOfUserRoles) {
		this.listOfUserRoles = listOfUserRoles;
	}

	public List<UserPermission> getListOfUserRoles() {
		return listOfUserRoles;
	}

	@Override
	public String toString() {
		return "ReceiveUserRolesAction [listOfUserRoles=" + listOfUserRoles + "]";
	}

	
	
	
}
