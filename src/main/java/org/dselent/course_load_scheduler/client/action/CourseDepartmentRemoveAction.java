package org.dselent.course_load_scheduler.client.action;

public class CourseDepartmentRemoveAction extends Action
{
    private Integer courseDepartmentId;

    public CourseDepartmentRemoveAction(Integer courseDepartmentId) {
        this.courseDepartmentId = courseDepartmentId;
    }

    public Integer getcourseDepartmentId() {
        return courseDepartmentId;
    }

    @Override
    public String toString() {
        return 
                "{" + "\'courseDepartmentId \'=\'" + courseDepartmentId + "\'"+
                "}";
    }
}
