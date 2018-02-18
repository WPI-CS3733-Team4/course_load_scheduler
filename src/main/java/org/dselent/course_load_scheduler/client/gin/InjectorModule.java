package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.*;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.*;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.*;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.*;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * Module where all to-be-injected dependencies are defined
 * 
 * @author dselent
 *
 */
public class InjectorModule extends AbstractGinModule
{
	@Override
    protected void configure()
    {
		// event bus
        bind(SimpleEventBus.class).in(Singleton.class);
        
        // presenters
        bind(IndexPresenter.class).to(IndexPresenterImpl.class).in(Singleton.class);
        bind(LoginPresenter.class).to(LoginPresenterImpl.class).in(Singleton.class);
        bind(RegisterPresenter.class).to(RegisterPresenterImpl.class).in(Singleton.class);
        bind(FacultyPresenter.class).to(FacultyPresenterImpl.class).in(Singleton.class);
        bind(AdminPresenter.class).to(AdminPresenterImpl.class).in(Singleton.class);
        bind(BuilderPresenter.class).to(BuilderPresenterImpl.class).in(Singleton.class);
        
        // views
        bind(IndexView.class).to(IndexViewImpl.class).in(Singleton.class);
        bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
        bind(RegisterView.class).to(RegisterViewImpl.class).in(Singleton.class);
        bind(FacultyView.class).to(FacultyViewImpl.class).in(Singleton.class);
        bind(AdminView.class).to(AdminViewImpl.class).in(Singleton.class);
        bind(BuilderView.class).to(BuilderViewImpl.class).in(Singleton.class);

    }
	
	/*
	 * Tried playing with this but had unresolved issues
	@Provides @Singleton @Inject
	public LoginPresenter provideLoginPresenter(IndexPresenter parentPresenter)
	{
	    return new LoginPresenter(parentPresenter);
	}
	*/
}