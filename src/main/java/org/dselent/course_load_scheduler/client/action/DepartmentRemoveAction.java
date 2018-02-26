package org.dselent.course_load_scheduler.client.action;

public class DepartmentRemoveAction extends Action
{
    private Integer departmentId;

    public DepartmentRemoveAction(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "{" +
                "\'departmentId\'=\'" + departmentId + "\'" +
                '}';
    }
}
