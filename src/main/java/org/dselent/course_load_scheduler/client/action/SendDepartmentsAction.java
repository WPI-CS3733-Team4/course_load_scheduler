package org.dselent.course_load_scheduler.client.action;

/*Created by Thananart Piyajarawong*/

public class SendDepartmentsAction extends Action{
	 private Integer departmentId;
	    private String department;

	    public SendDepartmentsAction() {
	    }

	    public Integer getDepartmentId() {
	        return departmentId;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	                "\'departmentId\'=\'"+departmentId+"\'" +
	                ",\'department\'=\'"+department+"\'" +
	                '}';
	    }
}
