package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveLoginAction extends Action{

	private User user;
	private String userName;
	private String password;
	
	public ReceiveLoginAction(User user) {
		this.user = user;
		this.userName = user.getUserName();
		this.password = user.getEncryptedPassword();
	}
	
	public User getUser() {
		return this.user;
	}
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ReceiveLoginAction [userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
}
