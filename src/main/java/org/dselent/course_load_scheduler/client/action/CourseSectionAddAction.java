package org.dselent.course_load_scheduler.client.action;

public class CourseSectionAddAction
{
    private Integer course_id;
    private Integer section_type;
    private String term;

    public CourseSectionAddAction(Integer course_id, Integer section_type, String term) {
        this.course_id = course_id;
        this.section_type = section_type;
        this.term = term;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public Integer getSection_type() {
        return section_type;
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "CourseSectionAddAction{" +
                "course_id=" + course_id +
                ", section_type=" + section_type +
                ", term='" + term + '\'' +
                '}';
    }
}

