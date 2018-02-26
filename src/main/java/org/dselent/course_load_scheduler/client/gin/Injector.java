package org.dselent.course_load_scheduler.client.gin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import org.dselent.course_load_scheduler.client.presenter.impl.*;
import org.dselent.course_load_scheduler.client.service.impl.*;
import org.dselent.course_load_scheduler.client.view.impl.*;

/**
 * Interface required by gin due to lack of runtime reflections
 * Provide methods to get all objects that are to be injected
 * 
 * GinModules annotation: indicates what the module file is
 * 
 * @author dselent
 *
 */
@GinModules(InjectorModule.class)
public interface Injector extends Ginjector
{
	// GIN generator will instantiate this
	// GWT.create uses deferred bindings where many permutations are created but only one
	// is used at runtime (the one for the specific browser)
    public static final Injector INSTANCE = GWT.create(Injector.class);

    //
    // event bus
    public SimpleEventBus getEventBus();
    
    // presenters
    public IndexPresenterImpl getIndexPresenter();
    public LoginPresenterImpl getLoginPresenter();
    public RegisterPresenterImpl getRegisterPresenter();
    public FacultyPresenterImpl getFacultyPresenter();
    public AdminPresenterImpl getAdminPresenter();
    public BuilderPresenterImpl getBuilderPresenter();
    
    //views
    public IndexViewImpl getIndexView();
    public LoginViewImpl getLoginView();
    public RegisterViewImpl getRegisterView();
    public FacultyViewImpl getFacultyView();
    public AdminViewImpl getAdminView();
    public BuilderViewImpl getBuilderView();
    
    //services
    public UserServiceImpl getUserService();

    public TableServiceImpl getTableService();
    public AdminServiceImpl getAdminService();
    public BuilderServiceImpl getBuilderService();
    public FacultyServiceImpl getFacultyService();
}
