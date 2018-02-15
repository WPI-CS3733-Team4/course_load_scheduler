package org.dselent.course_load_scheduler.client.action;

public class CourseRemoveAction
{
    private Integer course_id;

    public CourseRemoveAction(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    @Override
    public String toString() {
        return "CourseRemoveAction{" +
                "course_id=" + course_id +
                '}';
    }
}
