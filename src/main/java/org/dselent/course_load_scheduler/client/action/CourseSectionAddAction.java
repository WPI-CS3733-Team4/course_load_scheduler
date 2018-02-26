package org.dselent.course_load_scheduler.client.action;

public class CourseSectionAddAction extends Action
{
    private Integer courseId;
    private Integer sectionType;
    private String term;

    public CourseSectionAddAction(Integer courseId, Integer sectionType, String term) {
        this.courseId = courseId;
        this.sectionType = sectionType;
        this.term = term;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public Integer getSectionType() {
        return sectionType;
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "{" +
                "\'courseId\'=\'" + courseId + "\'"+
                ",\' sectionType\'=\'" + sectionType + "\'" +
                ", \'term\'=\'" + term + "\'" +
                '}';
    }
}

