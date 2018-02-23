package org.dselent.course_load_scheduler.client.action;

public class CourseSectionTimeModifyAction extends Action
{
    private Integer courseSectionTimeId;
    private Integer courseSectionId;
    private Integer dayOfWeek;
    private Integer startTime;
    private Integer endTime;
    private String location;

    public CourseSectionTimeModifyAction(Integer courseSectionTimeId, Integer courseSectionId, Integer dayOfWeek, Integer startTime, Integer endTime, String location) {
        this.courseSectionTimeId = courseSectionTimeId;
        this.courseSectionId = courseSectionId;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public Integer getcourseSectionTimeId() {
        return courseSectionTimeId;
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
        return "CourseSectionTimeModifyAction{" +
                "courseSectionTimeId=" + courseSectionTimeId +
                ", courseSectionId=" + courseSectionId +
                ", dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                '}';
    }
}
