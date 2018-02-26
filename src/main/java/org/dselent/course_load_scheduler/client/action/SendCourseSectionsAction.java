package org.dselent.course_load_scheduler.client.action;

/* Created by Krishna Madhurkar*/

public class SendCourseSectionsAction extends Action
{
    private Integer courseSectionId;
    private Integer courseId;
    private Integer sectionType;
    private String term;

    public SendCourseSectionsAction(Integer courseSectionId, Integer courseId, Integer sectionType, String term) {
        this.courseSectionId = courseSectionId;
        this.courseId = courseId;
        this.sectionType = sectionType;
        this.term = term;
    }

    public Integer getCourseSectionId() {
        return courseSectionId;
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
                "\'courseSectionId\'=\'"+courseSectionId+"\'"+
                ",\'courseId\'=\'"+courseId+"\'"+
                ",\'sectionType\'=\'" +sectionType+"\'"+
                ",\'term\'=\'"+term+"\'"+
                '}';
    }
}
