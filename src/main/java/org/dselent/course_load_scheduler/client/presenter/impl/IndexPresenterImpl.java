package org.dselent.course_load_scheduler.client.presenter.impl;

import javax.inject.Inject;

import org.dselent.course_load_scheduler.client.action.SendCourseRequestsAction;
import org.dselent.course_load_scheduler.client.action.SendCourseSectionsAction;
import org.dselent.course_load_scheduler.client.action.SendCourseTimesAction;
import org.dselent.course_load_scheduler.client.action.SendCoursesAction;
import org.dselent.course_load_scheduler.client.action.SendDepartmentsAction;
import org.dselent.course_load_scheduler.client.action.SendLocationsAction;
import org.dselent.course_load_scheduler.client.action.SendTermsAction;
import org.dselent.course_load_scheduler.client.action.SendUserRolesAction;
import org.dselent.course_load_scheduler.client.action.SendUsersAction;
import org.dselent.course_load_scheduler.client.action.UserAddAction;
import org.dselent.course_load_scheduler.client.event.SendCourseRequestsEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseSectionsEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseTimesEvent;
import org.dselent.course_load_scheduler.client.event.SendCoursesEvent;
import org.dselent.course_load_scheduler.client.event.SendDepartmentsEvent;
import org.dselent.course_load_scheduler.client.event.SendLocationsEvent;
import org.dselent.course_load_scheduler.client.event.SendTermsEvent;
import org.dselent.course_load_scheduler.client.event.SendUserRolesEvent;
import org.dselent.course_load_scheduler.client.event.SendUsersEvent;
import org.dselent.course_load_scheduler.client.event.UserAddEvent;
import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.IndexView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.HasWidgets;


public class IndexPresenterImpl extends BasePresenterImpl implements IndexPresenter
{
	private IndexView view;

	@Inject
	public IndexPresenterImpl(IndexView view)
	{
		this.view = view;
		view.setPresenter(this);
	}
	
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public IndexView getView()
	{
		return view;
	}
	
	// Currently no model
	@Override
	public Model getModel()
	{
		return null;
	}
	
	@Override
	public void showLoadScreen()
	{
		// thank you stackoverflow
		// https://stackoverflow.com/questions/23017908/gwt-set-the-visibility-of-widget-using-css-visibility-property
		view.getLoadingImage().getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
		view.getGlassLoadingPanel().getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
	}
	
	@Override
	public void hideLoadScreen()
	{
		view.getLoadingImage().getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
		view.getGlassLoadingPanel().getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
	}
	
	public void sendAdminTableRequests()
	{
		HasWidgets container = this.getView().getViewRootPanel();
		SendUsersAction sla = new SendUsersAction();
		SendUsersEvent sle = new SendUsersEvent(sla, container);
//		System.out.println("send REACHED");

		GWT.log("Send Table Requests Reached");
		eventBus.fireEvent(sle);
		
		SendUserRolesAction sla2 = new SendUserRolesAction();
		SendUserRolesEvent sle2 = new SendUserRolesEvent(sla2, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle2);

		
	}
	
	public void sendFacultyTableRequests()
	{
		HasWidgets container = this.getView().getViewRootPanel();
		SendCoursesAction sla = new SendCoursesAction();
		SendCoursesEvent sle = new SendCoursesEvent(sla, container);
//		System.out.println("send REACHED");

		GWT.log("Send Table Requests Reached");
		eventBus.fireEvent(sle);
		
		SendCourseRequestsAction sla2 = new SendCourseRequestsAction();
		SendCourseRequestsEvent sle2 = new SendCourseRequestsEvent(sla2, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle2);
		
		SendCourseSectionsAction sla3 = new SendCourseSectionsAction();
		SendCourseSectionsEvent sle3 = new SendCourseSectionsEvent(sla3, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle3);

		
	}
	
	public void sendBuilderTableRequests()
	{
		//course
		//course section
		//course section time
		//location
		//department
		//term
		HasWidgets container = this.getView().getViewRootPanel();
		SendCoursesAction sla = new SendCoursesAction();
		SendCoursesEvent sle = new SendCoursesEvent(sla, container);
//		System.out.println("send REACHED");

		GWT.log("Send Table Requests Reached");
		eventBus.fireEvent(sle);
		
		SendCourseSectionsAction sla2 = new SendCourseSectionsAction();
		SendCourseSectionsEvent sle2 = new SendCourseSectionsEvent(sla2, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle2);
		
		SendCourseTimesAction sla3 = new SendCourseTimesAction();
		SendCourseTimesEvent sle3 = new SendCourseTimesEvent(sla3, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle3);
		
		SendLocationsAction sla4 = new SendLocationsAction();
		SendLocationsEvent sle4 = new SendLocationsEvent(sla4, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle4);
		
		SendDepartmentsAction sla5 = new SendDepartmentsAction();
		SendDepartmentsEvent sle5 = new SendDepartmentsEvent(sla5, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle5);

		SendTermsAction sla6 = new SendTermsAction();
		SendTermsEvent sle6 = new SendTermsEvent(sla6, container);
//		System.out.println("send REACHED");

		eventBus.fireEvent(sle6);
	}
	
}
