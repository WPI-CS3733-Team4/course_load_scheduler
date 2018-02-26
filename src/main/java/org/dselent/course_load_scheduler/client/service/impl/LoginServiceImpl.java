package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.CourseLoadScheduler;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.service.LoginService;

import com.google.gwt.json.client.JSONObject;

public class LoginServiceImpl extends BaseServiceImpl implements LoginService{

	public LoginServiceImpl() {}
	
	@Override
	public void init() {
		bind();
	}
	
	@Override
	public void bind() {
		
	}
	
	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {
		
		
		if(evt.getAction().getUser() != null) {
			System.out.println("User is legit");
			// Go to the faculty view
			CourseLoadScheduler.facultyScreen();
		} else {
			System.out.println("User is NOT legit");
		}
	}
	
	
}
