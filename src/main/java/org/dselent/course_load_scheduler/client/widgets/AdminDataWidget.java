package org.dselent.course_load_scheduler.client.widgets;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Widget;


public class AdminDataWidget extends Composite {
	
	interface AdminDataWidgetBinder extends UiBinder<Widget, AdminDataWidget>{
		
	}
	
	private static UiBinder<Widget, AdminDataWidget> binder = GWT.create(AdminDataWidgetBinder.class);

	public AdminDataWidget() {
		initWidget(binder.createAndBindUi(this));
		
		
		userTable.setBorderWidth(2);
		userTable.setText(0, 0, "User Id:");
		userTable.setText(0, 1, "User Name:");
		userTable.setText(0, 2, "First Name:");
		userTable.setText(0, 3, "Last Name:");
		userTable.setText(0, 4, "Email:");
		userTable.setText(0, 5, "Password:");
		userTable.setText(0, 6, "Salt:");
		
		/*
		for (int i = 0; i < 30; i++) {
			userRoleTable.setText(i, 0,  "Test");
		}
		*/
		
		userRoleTable.setBorderWidth(2);
		userRoleTable.setText(0, 0, "Role Id:");
		userRoleTable.setText(0, 1, "User Id:");
		userRoleTable.setText(0, 2, "Role:");
		
	}
	
	@UiField
	FlexTable userTable;
	
	@UiField
	FlexTable userRoleTable;

}
