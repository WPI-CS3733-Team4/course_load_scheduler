package org.dselent.course_load_scheduler.client.action;

public class LocationModifyAction extends Action
{
    private Integer locationId;
    private String building;
    private Integer room;
    private Integer roomSize;

    public LocationModifyAction(Integer locationId, String building, Integer room, Integer roomSize) {
        this.locationId = locationId;
        this.building = building;
        this.room = room;
        this.roomSize = roomSize;
    }

    public Integer getlocationId() {
        return locationId;
    }

    public String getBuilding() {
        return building;
    }

    public Integer getRoom() {
        return room;
    }

    public Integer getRoomSize() {
        return roomSize;
    }

    @Override
    public String toString() {
        return "LocationModifyAction{" +
                "locationId=" + locationId +
                ", building='" + building + '\'' +
                ", room=" + room +
                ", roomSize=" + roomSize +
                '}';
    }
}
