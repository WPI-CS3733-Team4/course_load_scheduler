package org.dselent.course_load_scheduler.client.action;

public class FacultyRemoveAction extends Action
{
    private Integer facultyId;

    public FacultyRemoveAction(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Integer getfacultyId() {
        return facultyId;
    }

    @Override
    public String toString() {
        return "FacultyRemoveAction{" +
                "facultyId=" + facultyId +
                '}';
    }
}
