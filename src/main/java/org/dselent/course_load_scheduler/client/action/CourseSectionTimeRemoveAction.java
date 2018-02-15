package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeRemoveAction
{
    private Integer course_section_time_id;

    public CourseSectionTimeRemoveAction(Integer course_section_time_id) {
        this.course_section_time_id = course_section_time_id;
    }

    public Integer getCourse_section_time_id() {
        return course_section_time_id;
    }

    @Override
    public String toString() {
        return "CourseSectionTimeRemoveAction{" +
                "course_section_time_id=" + course_section_time_id +
                '}';
    }
}
