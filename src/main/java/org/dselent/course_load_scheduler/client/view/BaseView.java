package org.dselent.course_load_scheduler.client.view;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.BasePresenterImpl;

public interface BaseView<P extends BasePresenter>
{
	/**
	 * Sets the presenter associated with the view
     * @param presenter
	 */
    void setPresenter(BasePresenterImpl presenter);
	
	/**
	 * Returns the class ("this") for the view
	 */
	Widget getWidgetContainer();
	
	/**
	 * Returns the root panel for the given view
	 */
	HasWidgets getViewRootPanel();
}
