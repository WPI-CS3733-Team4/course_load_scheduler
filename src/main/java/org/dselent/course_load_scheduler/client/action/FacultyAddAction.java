package org.dselent.course_load_scheduler.client.action;

public class FacultyAddAction extends Action
{
    private Integer userId;
    private Integer requiredCredits;

    public FacultyAddAction(Integer userId, Integer requiredCredits) {
        this.userId = userId;
        this.requiredCredits = requiredCredits;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getRequiredCredits() {
        return requiredCredits;
    }

    @Override
    public String toString() {
        return "{"+
                "\'userId\'=\'"+userId+"\'"+
                ",\'requiredCredits\'=\'"+requiredCredits+"\'"+
                '}';
    }
}
