package org.dselent.course_load_scheduler.client.action;

public class CourseSectionRemoveAction extends Action
{
    private Integer courseSectionId;

    public CourseSectionRemoveAction(Integer courseSectionId) {
        this.courseSectionId = courseSectionId;
    }

    public Integer getCourseSectionId() {
        return courseSectionId;
    }

    @Override
    public String toString() {
        return "{" +
                "\'courseSectionId\'=\'"+courseSectionId+"\'"+
                '}';
    }
}
