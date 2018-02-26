package org.dselent.course_load_scheduler.client.action;

public class CourseAddAction extends Action
{
    private String courseName;
    private String courseDept;
    private String courseDescription;

    public CourseAddAction(String courseName, String courseDept, String courseDescription) {
        this.courseName = courseName;
        this.courseDept = courseDept;
        this.courseDescription = courseDescription;
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
        return "{"+
                ",\'courseName\'=\'" + courseName + "\'" +
                ",\' courseDept\'=\'" + courseDept + "\'" +
                ", \'courseDescription\'='" + courseDescription + "\'"+ +
                '}';
    }
}
