package org.dselent.course_load_scheduler.client.action;

public class DepartmentModifyAction extends Action
{
    private Integer departmentId;
    private String department;

    public DepartmentModifyAction(Integer departmentId, String department) {
        this.departmentId = departmentId;
        this.department = department;
    }

    public Integer getdepartmentId() {
        return departmentId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "DepartmentModifyAction{" +
                "departmentId=" + departmentId +
                ", department='" + department + '\'' +
                '}';
    }
}
