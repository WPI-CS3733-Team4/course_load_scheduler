package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveLocationsAction extends Action{

	private List<User> listOfLocations;
	
	public ReceiveLocationsAction(List<User> listOfLocations) {
		this.listOfLocations = listOfLocations;
	}

	public List<User> getListOfLocations() {
		return listOfLocations;
	}

	@Override
	public String toString() {
		return "ReceiveLocationsAction [listOfLocations=" + listOfLocations + "]";
	}

	
	
	
}
