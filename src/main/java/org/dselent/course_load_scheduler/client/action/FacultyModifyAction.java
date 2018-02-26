package org.dselent.course_load_scheduler.client.action;

public class FacultyModifyAction extends Action
{
    private Integer facultyId;
    private Integer userId;
    private Integer requiredCredits;

    public FacultyModifyAction(Integer facultyId, Integer userId, Integer requiredCredits) {
        this.facultyId = facultyId;
        this.userId = userId;
        this.requiredCredits = requiredCredits;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getRequiredCredits() {
        return requiredCredits;
    }

    @Override
    public String toString() {
        return "{" +
                "\'facultyId\'=\'" + facultyId + "\'" +
                ", \'userId\'=\'" + userId + "\'" +
                ", \'requiredCredits\'=\'" + requiredCredits + "\'" +
                '}';
    }
}
