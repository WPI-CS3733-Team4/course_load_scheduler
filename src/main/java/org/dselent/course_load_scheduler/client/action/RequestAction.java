package org.dselent.course_load_scheduler.client.action;

public class RequestAction extends Action
{
    private Integer facultyId;
    private Integer courseSectionId;

    public RequestAction(Integer facultyId, Integer courseSectionId) {
        this.facultyId = facultyId;
        this.courseSectionId = courseSectionId;
    }

    public Integer getfacultyId() {
        return facultyId;
    }

    public Integer getcourseSectionId() {
        return courseSectionId;
    }

    @Override
    public String toString() {
        return "{"+
                "\'facultyId\'=\'"+facultyId+"\'"+
                ",\'courseSectionId\'=\'"+courseSectionId+"\'"+
                '}';
    }
}
