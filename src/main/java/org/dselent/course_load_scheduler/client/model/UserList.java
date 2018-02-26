package org.dselent.course_load_scheduler.client.model;

import java.util.List;

public class UserList extends Model{
	private List<User> userList;
	
	public List<User> getUserList(){
		return userList;
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
