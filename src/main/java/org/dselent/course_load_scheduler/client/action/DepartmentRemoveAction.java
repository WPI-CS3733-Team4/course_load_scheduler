package org.dselent.course_load_scheduler.client.action;

public class DepartmentRemoveAction
{
    private Integer departmentId;

    public DepartmentRemoveAction(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getdepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "DepartmentRemoveAction{" +
                "departmentId=" + departmentId +
                '}';
    }
}
