package org.dselent.course_load_scheduler.client.action;

public class CourseModifyAction extends Action
{
    private Integer courseId;
    private String courseName;
    private String courseDept;
    private String courseDescription;

    public CourseModifyAction(Integer courseId, String courseName, String courseDept, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDept = courseDept;
        this.courseDescription = courseDescription;
    }

    public Integer getcourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    @Override
    public String toString() {
        return "CourseModifyAction{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDept='" + courseDept + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
}
