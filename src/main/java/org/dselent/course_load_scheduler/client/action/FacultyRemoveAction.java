package org.dselent.course_load_scheduler.client.action;

public class FacultyRemoveAction extends Action
{
    private Integer facultyId;

    public FacultyRemoveAction(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    @Override
    public String toString() {
        return "{" +
                "\'facultyId\'=\'" + facultyId + "\'" +
                '}';
    }
}
