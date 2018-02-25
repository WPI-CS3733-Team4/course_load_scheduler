package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeAddAction extends Action
{
    private Integer courseSectionId;
    private Integer dayOfWeek;
    private Integer startTime;
    private Integer endTime;
    private String location;

    public CourseSectionTimeAddAction(Integer courseSectionId, Integer dayOfWeek, Integer startTime, Integer endTime, String location) {
        this.courseSectionId = courseSectionId;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public Integer getCourseSectionId() {
        return courseSectionId;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CourseSectionTimeAddAction{" +
                "courseSectionId=" + courseSectionId +
                ", dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                '}';
    }
}
