package org.dselent.course_load_scheduler.client.action;

public class CourseSectionRemoveAction
{
    private Integer courseSectionId;

    public CourseSectionRemoveAction(Integer courseSectionId) {
        this.courseSectionId = courseSectionId;
    }

    public Integer getcourseSectionId() {
        return courseSectionId;
    }

    @Override
    public String toString() {
        return "CourseSectionRemoveAction{" +
                "courseSectionId=" + courseSectionId +
                '}';
    }
}
