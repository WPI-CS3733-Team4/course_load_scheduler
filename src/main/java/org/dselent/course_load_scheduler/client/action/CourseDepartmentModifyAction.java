package org.dselent.course_load_scheduler.client.action;

public class CourseDepartmentModifyAction
{
    private Integer courseDepartmentId;
    private Integer courseId;
    private Integer departmentId;
    private Integer courseNumber;

    public CourseDepartmentModifyAction(Integer courseDepartmentId, Integer courseId, Integer departmentId, Integer courseNumber) {
        this.courseDepartmentId = courseDepartmentId;
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.courseNumber = courseNumber;
    }

    public Integer getcourseDepartmentId() {
        return courseDepartmentId;
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
        return "CourseDepartmentModifyAction{" +
                "courseDepartmentId=" + courseDepartmentId +
                ", courseId=" + courseId +
                ", departmentId=" + departmentId +
                ", courseNumber=" + courseNumber +
                '}';
    }
}
