package org.dselent.course_load_scheduler.client.action;

public class CourseSectionModifyAction
{
    private Integer course_section_id;
    private Integer course_id;
    private Integer section_type;
    private String term;

    public CourseSectionModifyAction(Integer course_section_id, Integer course_id, Integer section_type, String term) {
        this.course_section_id = course_section_id;
        this.course_id = course_id;
        this.section_type = section_type;
        this.term = term;
    }

    public Integer getCourse_section_id() {
        return course_section_id;
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
        return "CourseSectionModifyAction{" +
                "course_section_id=" + course_section_id +
                ", course_id=" + course_id +
                ", section_type=" + section_type +
                ", term='" + term + '\'' +
                '}';
    }
}
