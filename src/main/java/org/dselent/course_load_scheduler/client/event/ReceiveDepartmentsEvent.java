package org.dselent.course_load_scheduler.client.event;
import org.dselent.course_load_scheduler.client.action.ReceiveDepartmentsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveDepartmentsEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

/*Created by Thananart Piyajarawong*/

public class ReceiveDepartmentsEvent extends DisplayEvent<ReceiveDepartmentsAction,ReceiveDepartmentsEventHandler>{
	public static Type<ReceiveDepartmentsEventHandler> TYPE = new Type<ReceiveDepartmentsEventHandler>();
	private ReceiveDepartmentsAction action;
	public ReceiveDepartmentsEvent(ReceiveDepartmentsAction action, HasWidgets container) {
		super(action,container);
		this.action =action;
	}
	
	public ReceiveDepartmentsAction getAction() {
		return action;
	}
	@Override
	public Type<ReceiveDepartmentsEventHandler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(ReceiveDepartmentsEventHandler handler) {
		handler.onReceiveDepartments(this);
	}

}
