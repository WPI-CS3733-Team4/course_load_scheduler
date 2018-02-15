package org.dselent.course_load_scheduler.client.action;

public class CourseSectionAddAction
{
    private Integer courseId;
    private Integer sectionType;
    private String term;

    public CourseSectionAddAction(Integer courseId, Integer sectionType, String term) {
        this.courseId = courseId;
        this.sectionType = sectionType;
        this.term = term;
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
        return "CourseSectionAddAction{" +
                "courseId=" + courseId +
                ", sectionType=" + sectionType +
                ", term='" + term + '\'' +
                '}';
    }
}

