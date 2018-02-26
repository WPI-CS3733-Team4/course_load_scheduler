package org.dselent.course_load_scheduler.client.action;

public class DepartmentAddAction extends Action
{
    private String department;

    public DepartmentAddAction(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "{" +
                "\'department\'=\'"+department+"\'"+
                '}';
    }
}
