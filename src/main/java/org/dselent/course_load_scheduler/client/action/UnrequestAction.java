package org.dselent.course_load_scheduler.client.action;

public class UnrequestAction extends Action
{
    private Integer courseRequestId;

    public UnrequestAction(Integer courseRequestId) {
        this.courseRequestId = courseRequestId;
    }

    public Integer getcourseRequestId() {
        return courseRequestId;
    }

    @Override
    public String toString() {
        return "{"+
                "\'courseRequestId\'=\'"+courseRequestId+"\'"+
                '}';
    }
}
