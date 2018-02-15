package org.dselent.course_load_scheduler.client.action;

public class FacultyAddAction
{
    private Integer user_id;
    private Integer required_credits;

    public FacultyAddAction(Integer user_id, Integer required_credits) {
        this.user_id = user_id;
        this.required_credits = required_credits;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getRequired_credits() {
        return required_credits;
    }

    @Override
    public String toString() {
        return "FacultyAddAction{" +
                "user_id=" + user_id +
                ", required_credits=" + required_credits +
                '}';
    }
}
