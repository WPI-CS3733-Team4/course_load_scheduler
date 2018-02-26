package org.dselent.course_load_scheduler.client.widgets;



import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.model.UserPermission;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;


public class AdminDataWidget extends Composite {
	
	interface AdminDataWidgetBinder extends UiBinder<Widget, AdminDataWidget>{}
	
	private static UiBinder<Widget, AdminDataWidget> binder = GWT.create(AdminDataWidgetBinder.class);
	
	@UiField
	static CellTable<User> userTable;
	
	@UiField
	static CellTable<UserPermission> userPermissionTable;
	
	// Constructor
	public AdminDataWidget() {
		initWidget(binder.createAndBindUi(this));
		 
		createUserTableHeaders();		
		createPermissionTableHeaders();
	}
	
	private void createUserTableHeaders() {
				
		TextColumn<User> idColumn = new TextColumn<User>() {
	    	@Override
	    	public String getValue(User object) {
	    		return object.getId().toString();
	    	}
	    };
	    
	    TextColumn<User> userNameColumn = new TextColumn<User>() {
	    	@Override
	    	public String getValue(User object) {
	    		return object.getUserName();
	    	}
	    };
	    
	    TextColumn<User> firstNameColumn = new TextColumn<User>() {
	      @Override
	      public String getValue(User object) {
	        return object.getFirstName();
	      }
	    };
	    
	    TextColumn<User> lastNameColumn = new TextColumn<User>() {
	    	@Override
	    	public String getValue(User object) {
	    		return object.getLastName();
	    	}
	    };
	    
	    TextColumn<User> emailColumn = new TextColumn<User>() {
	    	@Override
	    	public String getValue(User object) {
	    		return object.getEmail();
	    	}
	    };
	    
    
	    userTable.addColumn(idColumn, "ID:");
	    userTable.addColumn(userNameColumn, "User Name:");
	    userTable.addColumn(firstNameColumn, "First Name:");
	    userTable.addColumn(lastNameColumn, "Last Name:");
	    userTable.addColumn(emailColumn, "Email:");
	    
	    		
	}
	
	private void createPermissionTableHeaders() {
		
		TextColumn<UserPermission> idColumn = new TextColumn<UserPermission>() {
			@Override
			public String getValue(UserPermission object) {
				return object.getId().toString();
			}
		};
		
		TextColumn<UserPermission> userIdColumn = new TextColumn<UserPermission>() {
			@Override
			public String getValue(UserPermission object) {
				return object.getUsersId().toString();
			}
		};
		
		
		TextColumn<UserPermission> roleColumn = new TextColumn<UserPermission>() {
			@Override
			public String getValue(UserPermission object) {
				return object.getRole();
			}
		};
		
		userPermissionTable.addColumn(idColumn, "ID:");
		userPermissionTable.addColumn(userIdColumn, "User:");
		userPermissionTable.addColumn(roleColumn, "Role:");
	}
	
	public static void populateUserTable(List<User> userList) {
		userTable.setRowCount(8, true);
		userTable.setRowData(0, userList);
	}
	
	public static List<User> testingUserTable() {
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));	
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));	
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));	
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));	
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));	
		userList.add(new User(1, "Rob"));
		userList.add(new User(2, "Mike"));
		userList.add(new User(3, "Krishna"));
		userList.add(new User(4, "Nathan"));
		userList.add(new User(5, "Doug"));
		return userList;
	}
	
	public static void populateUserPermissionTable(List<UserPermission> permissionList) {
		userPermissionTable.setRowCount(8, true);
		userPermissionTable.setRowData(0, permissionList);
	}
	
	public static List<UserPermission> testingUserPermissionTable(){
		List<UserPermission> permissionList = new ArrayList<UserPermission>();
		
		permissionList.add(new UserPermission(1,3,"Master Coder"));
		permissionList.add(new UserPermission(2,5,"Moral Support"));
		permissionList.add(new UserPermission(3,4,"Null"));
		
		return permissionList;
	}

}
