package org.dselent.course_load_scheduler.client.action;

public class LocationModifyAction
{
    private Integer location_id;
    private String building;
    private Integer room;
    private Integer roomSize;

    public LocationModifyAction(Integer location_id, String building, Integer room, Integer roomSize) {
        this.location_id = location_id;
        this.building = building;
        this.room = room;
        this.roomSize = roomSize;
    }

    public Integer getLocation_id() {
        return location_id;
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
                "location_id=" + location_id +
                ", building='" + building + '\'' +
                ", room=" + room +
                ", roomSize=" + roomSize +
                '}';
    }
}
