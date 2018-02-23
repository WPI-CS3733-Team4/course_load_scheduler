package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeRemoveAction extends Action
{
    private Integer courseSectionTimeId;

    public CourseSectionTimeRemoveAction(Integer courseSectionTimeId) {
        this.courseSectionTimeId = courseSectionTimeId;
    }

    public Integer getcourseSectionTimeId() {
        return courseSectionTimeId;
    }

    @Override
    public String toString() {
        return "CourseSectionTimeRemoveAction{" +
                "courseSectionTimeId=" + courseSectionTimeId +
                '}';
    }
}
