package org.dselent.course_load_scheduler.client.action;

public class CourseDepartmentRemoveAction
{
    private Integer course_department_id;

    public CourseDepartmentRemoveAction(Integer course_department_id) {
        this.course_department_id = course_department_id;
    }

    public Integer getCourse_department_id() {
        return course_department_id;
    }

    @Override
    public String toString() {
        return "CourseDepartmentRemoveAction{" +
                "course_department_id=" + course_department_id +
                '}';
    }
}
