package org.dselent.course_load_scheduler.client.widgets;

import org.dselent.course_load_scheduler.client.CourseLoadScheduler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;


public class NavBarWidget extends Composite {
	
	interface NavBarWidgetBinder extends UiBinder<Widget, NavBarWidget>{
		
	}
	
	private static UiBinder<Widget, NavBarWidget> binder = GWT.create(NavBarWidgetBinder.class);

	public NavBarWidget() {
		initWidget(binder.createAndBindUi(this));
	}
	
	@UiField
	Button adminButton;
	
	@UiField
	Button facultyButton;
	
	@UiField
	Button builderButton;
	
	@UiHandler("adminButton")
	void onAdminButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.adminScreen();
	}
	
	@UiHandler("facultyButton")
	void onFacultyButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.facultyScreen();
	}
	
	@UiHandler("builderButton")
	void onBuilderButtonClicked(ClickEvent evt) {
		CourseLoadScheduler.builderScreen();
	}



}
