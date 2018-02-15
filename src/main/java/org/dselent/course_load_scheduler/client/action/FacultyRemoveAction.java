package org.dselent.course_load_scheduler.client.action;

public class FacultyRemoveAction
{
    private Integer faculty_id;

    public FacultyRemoveAction(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    @Override
    public String toString() {
        return "FacultyRemoveAction{" +
                "faculty_id=" + faculty_id +
                '}';
    }
}
