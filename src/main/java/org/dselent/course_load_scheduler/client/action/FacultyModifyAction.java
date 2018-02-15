package org.dselent.course_load_scheduler.client.action;

public class FacultyModifyAction
{
    private Integer faculty_id;
    private Integer user_id;
    private Integer required_credits;

    public FacultyModifyAction(Integer faculty_id, Integer user_id, Integer required_credits) {
        this.faculty_id = faculty_id;
        this.user_id = user_id;
        this.required_credits = required_credits;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getRequired_credits() {
        return required_credits;
    }

    @Override
    public String toString() {
        return "FacultyModifyAction{" +
                "faculty_id=" + faculty_id +
                ", user_id=" + user_id +
                ", required_credits=" + required_credits +
                '}';
    }
}
