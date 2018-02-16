package org.dselent.course_load_scheduler.client.action;

public class UserRemoveAction
{
    private String userId;

    public UserRemoveAction(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserRemoveAction{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
