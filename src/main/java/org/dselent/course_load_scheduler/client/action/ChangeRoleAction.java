package org.dselent.course_load_scheduler.client.action;

public class ChangeRoleAction
{
    private Integer userId;
    private String role;

    public ChangeRoleAction(Integer userId, String role) {
        this.userId = userId;
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "ChangeRoleAction{" +
                "userId=" + userId +
                ", role='" + role + '\'' +
                '}';
    }
}
