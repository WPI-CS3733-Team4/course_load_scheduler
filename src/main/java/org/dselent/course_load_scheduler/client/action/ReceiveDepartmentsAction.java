package org.dselent.course_load_scheduler.client.action;
import java.util.List;
import org.dselent.course_load_scheduler.client.model.User;
/*Created by Thananart Piyajarawong*/
public class ReceiveDepartmentsAction extends Action{
	
	private List<User> listOfDepartments;
	
	public ReceiveDepartmentsAction(List<User> listOfDepartments) {
		this.listOfDepartments = listOfDepartments;
	}
	
	public List<User> getListOfDepartments(){
		return listOfDepartments;
	}
	
	@Override
	public String toString() {
		return "ReceiveDepartmentsAction [listOfDepartments=" + listOfDepartments + "]";
	}
	
}
