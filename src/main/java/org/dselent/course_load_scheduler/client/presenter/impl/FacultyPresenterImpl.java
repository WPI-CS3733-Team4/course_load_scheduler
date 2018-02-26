package org.dselent.course_load_scheduler.client.presenter.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;
import org.dselent.course_load_scheduler.client.action.InvalidFieldAction;
import org.dselent.course_load_scheduler.client.action.RequestAction;
import org.dselent.course_load_scheduler.client.action.UnrequestAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidRequestStrings;
import org.dselent.course_load_scheduler.client.event.InvalidFieldEvent;
import org.dselent.course_load_scheduler.client.event.RequestEvent;
import org.dselent.course_load_scheduler.client.event.UnrequestEvent;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyView;

import java.util.ArrayList;
import java.util.List;

/* Created by Nathan Siegel */

public class FacultyPresenterImpl extends BasePresenterImpl implements FacultyPresenter
{
	private IndexPresenter parentPresenter;
	private FacultyView view;
	private boolean requestClickInProgress;
	private boolean unrequestClickInProgress;

	@Inject
	public FacultyPresenterImpl(IndexPresenter parentPresenter, FacultyView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		requestClickInProgress = false;
		unrequestClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidFieldEvent.TYPE, this);
		eventBusRegistration.put(InvalidFieldEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public FacultyView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}
	
	@Override
	public void requestCourse()
	{
		if(!requestClickInProgress) {
			requestClickInProgress = true;
			view.getRequestButton().setEnabled(false);
			parentPresenter.showLoadScreen();

			Integer facultyId = null;
			Integer courseSectionId = null;

			boolean fieldsAreValid = true;

			List<String> invalidReasonList = new ArrayList<>();
			try {
				facultyId = Integer.parseInt(view.getFacultyIdTextBox().getText());

			} catch(NumberFormatException e) {
				invalidReasonList.add(InvalidRequestStrings.INVALID_FACULTY_ID);
				fieldsAreValid = false;
			}

			try {
				courseSectionId = Integer.parseInt(view.getCourseSectionIdTextBox().getText());
			} catch(NumberFormatException e) {
				invalidReasonList.add(InvalidRequestStrings.INVALID_COURSE_SECTION_ID);
				fieldsAreValid = false;
			}

			if(fieldsAreValid) {
				sendRequest(facultyId, courseSectionId);
			} else {
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		} else {
			getParentPresenter().hideLoadScreen();
		}
	}
	
	private void sendRequest(Integer facultyId, Integer courseSectionId)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		RequestAction sla = new RequestAction(facultyId, courseSectionId);
		RequestEvent sle = new RequestEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void unrequestCourse()
	{
		if(!unrequestClickInProgress) {
			unrequestClickInProgress = true;
			view.getUnrequestButton().setEnabled(false);
			parentPresenter.showLoadScreen();

			Integer requestId = null;

			boolean fieldsAreValid = true;

			List<String> invalidReasonList = new ArrayList<>();
			try {
				requestId = Integer.parseInt(view.getRequestIdTextBox().getText());

			} catch(NumberFormatException e) {
				invalidReasonList.add(InvalidRequestStrings.INVALID_REQUEST_ID);
				fieldsAreValid = false;
			}

			if(fieldsAreValid) {
				sendUnrequest(requestId);
			} else {
				InvalidFieldAction ila = new InvalidFieldAction(invalidReasonList);
				InvalidFieldEvent ile = new InvalidFieldEvent(ila);
				eventBus.fireEvent(ile);
			}
		} else {
			getParentPresenter().hideLoadScreen();
		}
	}
	
	private void sendUnrequest(Integer requestId)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		UnrequestAction sla = new UnrequestAction(requestId);
		UnrequestEvent sle = new UnrequestEvent(sla,container);
		eventBus.fireEvent(sle);
	}
	/*
	 * Currently only sent by itself
	 * Probably did not need the event bus for this
	 * Useful for example purposes without involving server-side
	*/
	@Override
	public void onInvalidField(InvalidFieldEvent evt)
	{
		parentPresenter.hideLoadScreen();
		view.getRequestButton().setEnabled(true);
		view.getUnrequestButton().setEnabled(true);
		requestClickInProgress = false;
		unrequestClickInProgress = false;
		
		InvalidFieldAction ila = evt.getAction();
        GWT.log(ila.toString());
//		view.showErrorMessages(ila.toString());
	}
}
