package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeAddAction
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

    public Integer getcourseSectionId() {
        return courseSectionId;
    }

    public Integer getdayOfWeek() {
        return dayOfWeek;
    }

    public Integer getstartTime() {
        return startTime;
    }

    public Integer getendTime() {
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
