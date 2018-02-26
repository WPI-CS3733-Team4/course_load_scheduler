package org.dselent.course_load_scheduler.client.presenter;


public interface IndexPresenter extends BasePresenter
{
	public void showLoadScreen();
	public void hideLoadScreen();
	public void sendAdminTableRequests();
	public void sendFacultyTableRequests();
	public void sendBuilderTableRequests();
}
