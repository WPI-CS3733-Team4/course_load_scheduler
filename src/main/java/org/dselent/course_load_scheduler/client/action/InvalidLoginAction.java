package org.dselent.course_load_scheduler.client.action;

public class InvalidLoginAction extends Action{
	
	private String login;
	
	public InvalidLoginAction(String login) {
		this.login = login;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("InvalidLoginAction [");
		builder.append("]");
		return builder.toString();
	}

}
