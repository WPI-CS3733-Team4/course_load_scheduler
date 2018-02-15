package org.dselent.course_load_scheduler.client.action;

public class CourseDepartmentModifyAction
{
    private Integer course_department_id;
    private Integer course_id;
    private Integer department_id;
    private Integer course_number;

    public CourseDepartmentModifyAction(Integer course_department_id, Integer course_id, Integer department_id, Integer course_number) {
        this.course_department_id = course_department_id;
        this.course_id = course_id;
        this.department_id = department_id;
        this.course_number = course_number;
    }

    public Integer getCourse_department_id() {
        return course_department_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public Integer getCourse_number() {
        return course_number;
    }

    @Override
    public String toString() {
        return "CourseDepartmentModifyAction{" +
                "course_department_id=" + course_department_id +
                ", course_id=" + course_id +
                ", department_id=" + department_id +
                ", course_number=" + course_number +
                '}';
    }
}
