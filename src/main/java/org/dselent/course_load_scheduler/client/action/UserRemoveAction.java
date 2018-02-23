package org.dselent.course_load_scheduler.client.action;

public class UserRemoveAction extends Action
{
    private Integer userId;

    public UserRemoveAction(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserRemoveAction{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
