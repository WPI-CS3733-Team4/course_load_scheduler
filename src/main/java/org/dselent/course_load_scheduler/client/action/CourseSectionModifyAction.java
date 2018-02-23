package org.dselent.course_load_scheduler.client.action;

public class CourseSectionModifyAction extends Action
{
    private Integer courseSectionId;
    private Integer courseId;
    private Integer sectionType;
    private String term;

    public CourseSectionModifyAction(Integer courseSectionId, Integer courseId, Integer sectionType, String term) {
        this.courseSectionId = courseSectionId;
        this.courseId = courseId;
        this.sectionType = sectionType;
        this.term = term;
    }

    public Integer getcourseSectionId() {
        return courseSectionId;
    }

    public Integer getcourseId() {
        return courseId;
    }

    public Integer getsectionType() {
        return sectionType;
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "CourseSectionModifyAction{" +
                "courseSectionId=" + courseSectionId +
                ", courseId=" + courseId +
                ", sectionType=" + sectionType +
                ", term='" + term + '\'' +
                '}';
    }
}
