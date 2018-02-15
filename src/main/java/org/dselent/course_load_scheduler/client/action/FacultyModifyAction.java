package org.dselent.course_load_scheduler.client.action;

public class FacultyModifyAction
{
    private Integer facultyId;
    private Integer userId;
    private Integer requiredCredits;

    public FacultyModifyAction(Integer facultyId, Integer userId, Integer requiredCredits) {
        this.facultyId = facultyId;
        this.userId = userId;
        this.requiredCredits = requiredCredits;
    }

    public Integer getfacultyId() {
        return facultyId;
    }

    public Integer getuserId() {
        return userId;
    }

    public Integer getrequiredCredits() {
        return requiredCredits;
    }

    @Override
    public String toString() {
        return "FacultyModifyAction{" +
                "facultyId=" + facultyId +
                ", userId=" + userId +
                ", requiredCredits=" + requiredCredits +
                '}';
    }
}
