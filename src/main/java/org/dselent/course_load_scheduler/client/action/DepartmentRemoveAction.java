package org.dselent.course_load_scheduler.client.action;

public class DepartmentRemoveAction
{
    private Integer department_id;

    public DepartmentRemoveAction(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    @Override
    public String toString() {
        return "DepartmentRemoveAction{" +
                "department_id=" + department_id +
                '}';
    }
}
