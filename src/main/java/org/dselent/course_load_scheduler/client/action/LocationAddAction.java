package org.dselent.course_load_scheduler.client.action;

public class LocationAddAction extends Action
{
    private String building;
    private Integer room;
    private Integer roomSize;

    public LocationAddAction(String building, Integer room, Integer roomSize) {
        this.building = building;
        this.room = room;
        this.roomSize = roomSize;
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
        return "{" +
                "\'building\'=\'" + building + '\'' +
                ", \'room\'=\'" + room + '\'' +
                ", \'roomSize\'=\'" + roomSize + '\'' +
                '}';
    }
}