package org.dselent.course_load_scheduler.client.action;

public class DepartmentModifyAction
{
    private Integer department_id;
    private String department;

    public DepartmentModifyAction(Integer department_id, String department) {
        this.department_id = department_id;
        this.department = department;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "DepartmentModifyAction{" +
                "department_id=" + department_id +
                ", department='" + department + '\'' +
                '}';
    }
}
