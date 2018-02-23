package org.dselent.course_load_scheduler.client.action;

public class FacultyAddAction extends Action
{
    private Integer userId;
    private Integer requiredCredits;

    public FacultyAddAction(Integer userId, Integer requiredCredits) {
        this.userId = userId;
        this.requiredCredits = requiredCredits;
    }

    public Integer getuserId() {
        return userId;
    }

    public Integer getrequiredCredits() {
        return requiredCredits;
    }

    @Override
    public String toString() {
        return "FacultyAddAction{" +
                "userId=" + userId +
                ", requiredCredits=" + requiredCredits +
                '}';
    }
}
