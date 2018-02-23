package org.dselent.course_load_scheduler.client.action;

public class LocationRemoveAction extends Action
{
    private Integer locationId;

    public LocationRemoveAction(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    @Override
    public String toString() {
        return "LocationRemoveAction{" +
                "locationId=" + locationId +
                '}';
    }
}
