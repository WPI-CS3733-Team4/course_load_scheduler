package org.dselent.course_load_scheduler.client.action;

public class CourseRemoveAction extends Action
{
    private Integer courseId;

    public CourseRemoveAction(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getcourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "CourseRemoveAction{" +
                "courseId=" + courseId +
                '}';
    }
}
