package org.dselent.course_load_scheduler.client.action;

public class CourseSectionRemoveAction
{
    private Integer course_section_id;

    public CourseSectionRemoveAction(Integer course_section_id) {
        this.course_section_id = course_section_id;
    }

    public Integer getCourse_section_id() {
        return course_section_id;
    }

    @Override
    public String toString() {
        return "CourseSectionRemoveAction{" +
                "course_section_id=" + course_section_id +
                '}';
    }
}
