package org.dselent.course_load_scheduler.client.action;

public class CourseModifyAction
{
    private Integer course_id;
    private String courseName;
    private String courseDept;
    private String courseDescription;

    public CourseModifyAction(Integer course_id, String courseName, String courseDept, String courseDescription) {
        this.course_id = course_id;
        this.courseName = courseName;
        this.courseDept = courseDept;
        this.courseDescription = courseDescription;
    }

    public Integer getCourse_id() {
        return course_id;
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
                "course_id=" + course_id +
                ", courseName='" + courseName + '\'' +
                ", courseDept='" + courseDept + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
}
