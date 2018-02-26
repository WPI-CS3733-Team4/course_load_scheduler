package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Location;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveLocationsAction extends Action{

	private List<Location> listOfLocations;
	
	public ReceiveLocationsAction(List<Location> listOfLocations) {
		this.listOfLocations = listOfLocations;
	}

	public List<Location> getListOfLocations() {
		return listOfLocations;
	}

	@Override
	public String toString() {
		return "ReceiveLocationsAction [listOfLocations=" + listOfLocations + "]";
	}

	
	
	
}
