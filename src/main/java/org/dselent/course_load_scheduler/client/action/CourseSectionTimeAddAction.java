package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeAddAction
{
    private Integer course_section_id;
    private Integer day_of_week;
    private Integer start_time;
    private Integer end_time;
    private String location;

    public CourseSectionTimeAddAction(Integer course_section_id, Integer day_of_week, Integer start_time, Integer end_time, String location) {
        this.course_section_id = course_section_id;
        this.day_of_week = day_of_week;
        this.start_time = start_time;
        this.end_time = end_time;
        this.location = location;
    }

    public Integer getCourse_section_id() {
        return course_section_id;
    }

    public Integer getDay_of_week() {
        return day_of_week;
    }

    public Integer getStart_time() {
        return start_time;
    }

    public Integer getEnd_time() {
        return end_time;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CourseSectionTimeAddAction{" +
                "course_section_id=" + course_section_id +
                ", day_of_week=" + day_of_week +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", location='" + location + '\'' +
                '}';
    }
}
