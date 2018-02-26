package org.dselent.course_load_scheduler.client.action;

public class ChangeRoleAction extends Action
{
	private Integer userRoleId;
    private Integer userId;
    private String role;

    public ChangeRoleAction(Integer userRoleId, Integer userId, String role) {
    	this.userRoleId = userRoleId;
        this.userId = userId;
        this.role = role;
    }
    
    public Integer getUserRoleId() {
    	return userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "{" +
                "\'userId\'=\'" + userId + '\'' +
                ", \'role\'=\'" + role + '\'' +
                '}';
    }
}
