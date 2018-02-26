package org.dselent.course_load_scheduler.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.impl.*;
import org.dselent.course_load_scheduler.client.service.impl.BuilderServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.FacultyServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.TableServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
import org.dselent.course_load_scheduler.client.view.*;
import org.dselent.course_load_scheduler.client.widgets.AdminDataWidget;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CourseLoadScheduler implements EntryPoint
{

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		RootLayoutPanel root = RootLayoutPanel.get();
//
//		 Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;


		BuilderServiceImpl builderService = injector.getBuilderService();
		builderService.init();
		FacultyServiceImpl facultyService = injector.getFacultyService();
		facultyService.init();
		UserServiceImpl userService = injector.getUserService();
		userService.init();
        TableServiceImpl tableService = injector.getTableService();
        tableService.init();


		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
        LoginView loginView = loginPresenter.getView();
        
        RegisterPresenterImpl registerPresenter = injector.getRegisterPresenter();
        registerPresenter.init();
        RegisterView registerView = registerPresenter.getView();

        FacultyPresenterImpl facultyPresenter = injector.getFacultyPresenter();
        facultyPresenter.init();
        FacultyView facultyView = facultyPresenter.getView();
        
        AdminPresenterImpl adminPresenter = injector.getAdminPresenter();
        adminPresenter.init();
        AdminView adminView = adminPresenter.getView();
        
        BuilderPresenterImpl builderPresenter = injector.getBuilderPresenter();
        builderPresenter.init();
        BuilderView builderView = builderPresenter.getView();

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
		loginPresenter.go(indexView.getViewRootPanel());
		
		
		
		
	}
	
	static public void adminScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        AdminPresenterImpl adminPresenter = injector.getAdminPresenter();
        adminPresenter.init();
        AdminView adminView = adminPresenter.getView();
        
      

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
	
		adminPresenter.go(indexView.getViewRootPanel());
		
		indexPresenter.sendAdminTableRequests();
		
		// Populate the cell table
		//AdminDataWidget.populateUserTable(AdminDataWidget.testingUserTable());
		//AdminDataWidget.populateUserPermissionTable(AdminDataWidget.testingUserPermissionTable());
	}
	
	static public void facultyScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        FacultyPresenterImpl facultyPresenter = injector.getFacultyPresenter();
        facultyPresenter.init();
        FacultyView facultyView = facultyPresenter.getView();
        
      

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
	
		facultyPresenter.go(indexView.getViewRootPanel());
		
		indexPresenter.sendFacultyTableRequests();
		
	}
	
	static public void builderScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        BuilderPresenterImpl builderPresenter = injector.getBuilderPresenter();
        builderPresenter.init();
        BuilderView builderView = builderPresenter.getView();
        
      

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
	
		builderPresenter.go(indexView.getViewRootPanel());
		
		indexPresenter.sendBuilderTableRequests();
	}
	
	static public void registerScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        RegisterPresenterImpl registerPresenter = injector.getRegisterPresenter();
        registerPresenter.init();
        RegisterView registerView = registerPresenter.getView();
        
      

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
	
		registerPresenter.go(indexView.getViewRootPanel());
	}
	
	static public void loginScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
        loginPresenter.init();
        LoginView loginView = loginPresenter.getView();
        
      

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);
	
		loginPresenter.go(indexView.getViewRootPanel());
	}
}
