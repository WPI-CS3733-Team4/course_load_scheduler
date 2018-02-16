package org.dselent.course_load_scheduler.client.action;

public class SendLogoutAction
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
        return "SendLogoutAction{" +
                "userId=" + userId +
                '}';
    }
}
