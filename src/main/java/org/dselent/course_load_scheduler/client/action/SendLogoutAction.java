package org.dselent.course_load_scheduler.client.action;

public class SendLogoutAction extends Action
{
    private Integer userId;

    public SendLogoutAction(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "{" +
                "\'userId\'=\'" + userId + "\'" +
                '}';
    }
}
