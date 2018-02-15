package org.dselent.course_load_scheduler.client.action;

public class CourseDepartmentAddAction
{
    private Integer courseId;
    private Integer departmentId;
    private Integer courseNumber;

    public CourseDepartmentAddAction(Integer courseId, Integer departmentId, Integer courseNumber) {
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.courseNumber = courseNumber;
    }

    public Integer getcourseId() {
        return courseId;
    }

    public Integer getdepartmentId() {
        return departmentId;
    }

    public Integer getcourseNumber() {
        return courseNumber;
    }

    @Override
    public String toString() {
        return "CourseDepartmentAddAction{" +
                "courseId=" + courseId +
                ", departmentId=" + departmentId +
                ", courseNumber=" + courseNumber +
                '}';
    }
}
