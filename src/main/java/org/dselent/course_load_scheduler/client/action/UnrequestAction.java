package org.dselent.course_load_scheduler.client.action;

public class UnrequestAction
{
    private Integer course_request_id;

    public UnrequestAction(Integer course_request_id) {
        this.course_request_id = course_request_id;
    }

    public Integer getCourse_request_id() {
        return course_request_id;
    }

    @Override
    public String toString() {
        return "UnrequestAction{" +
                "course_request_id=" + course_request_id +
                '}';
    }
}
