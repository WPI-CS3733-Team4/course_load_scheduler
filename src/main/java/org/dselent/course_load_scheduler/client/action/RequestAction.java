package org.dselent.course_load_scheduler.client.action;

public class RequestAction
{
    private Integer faculty_id;
    private Integer course_section_id;

    public RequestAction(Integer faculty_id, Integer course_section_id) {
        this.faculty_id = faculty_id;
        this.course_section_id = course_section_id;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public Integer getCourse_section_id() {
        return course_section_id;
    }

    @Override
    public String toString() {
        return "RequestAction{" +
                "faculty_id=" + faculty_id +
                ", course_section_id=" + course_section_id +
                '}';
    }
}
