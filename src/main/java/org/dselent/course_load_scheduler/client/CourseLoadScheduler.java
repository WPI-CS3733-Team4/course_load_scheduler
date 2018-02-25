package org.dselent.course_load_scheduler.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.impl.*;
import org.dselent.course_load_scheduler.client.view.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CourseLoadScheduler implements EntryPoint
{

    static public void registerScreen() {

		RootLayoutPanel root = RootLayoutPanel.get();

		final Injector injector = Injector.INSTANCE;


        IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
        IndexView indexView = indexPresenter.getView();

        RegisterPresenterImpl registerPresenter = injector.getRegisterPresenter();
        registerPresenter.init();
        RegisterView registerView = registerPresenter.getView();


//        AdminServiceImpl asi = new AdminServiceImpl();
//        asi.init();

        indexPresenter.go(RootPanel.get("indexContainer"));
		indexPresenter.go(root);

        registerPresenter.go(indexView.getViewRootPanel());
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
	}

    /**
     * This is the entry point method.
     */


    public void onModuleLoad() {
		RootLayoutPanel root = RootLayoutPanel.get();

//        SimplePanelExample simplePanelExample = new SimplePanelExample();
//        root.add(simplePanelExample);
//
//        SimplePanelExample2 simplePanelExample2 = new SimplePanelExample2();
//        root.add(simplePanelExample2);
//
//
//        HTMLPanelExample htmlPanelExample = new HTMLPanelExample();
//        root.add(htmlPanelExample);
//
//
//        FlowPanelExample flowPanelExample = new FlowPanelExample();
//        root.add(flowPanelExample);
//
//        VerticalPanelExample verticalPanelExample = new VerticalPanelExample();
//        root.add(verticalPanelExample);
//
//        HorizontalPanelExample horizontalPanelExample = new HorizontalPanelExample();
//        root.add(horizontalPanelExample);
//
//        DockLayoutPanelExample dockLayoutPanelExample = new DockLayoutPanelExample();
//        root.add(dockLayoutPanelExample);
//
//        GridExample gridExample = new GridExample();
//        root.add(gridExample);
//
//        TabLayoutPanelExample tabLayoutPanelExample = new TabLayoutPanelExample();
//        root.add(tabLayoutPanelExample);
//
//        ExamplesPanel examplesPanel = new ExamplesPanel();
//        root.add(examplesPanel);
//
//		 Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;

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
        //registerPresenter.go(indexView.getViewRootPanel());

        //facultyPresenter.go(indexView.getViewRootPanel());
        //adminPresenter.go(indexView.getViewRootPanel());

        //facultyPresenter.go(indexView.getViewRootPanel());
        //adminPresenter.go(indexView.getViewRootPanel());

        //builderPresenter.go(indexView.getViewRootPanel());

        GWT.log("helloWorld");





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


