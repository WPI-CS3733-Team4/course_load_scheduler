package org.dselent.course_load_scheduler.client.action;

/*Created by Thananart Piyajarawong*/

public class SendDepartmentAction extends Action{
	 private Integer departmentId;
	    private String department;

	    public SendDepartmentAction(Integer departmentId, String department) {
	        this.departmentId = departmentId;
	        this.department = department;
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
