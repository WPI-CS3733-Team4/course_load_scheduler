package org.dselent.course_load_scheduler.client.action;

public class ConfirmUserAction extends Action
{
    private Integer userId;

    public ConfirmUserAction(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "{" +
                "\'userId\'=\'"+userId+"\'"+
                '}';
    }
}
