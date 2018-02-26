package org.dselent.course_load_scheduler.client.model;

import java.util.Date;
import java.util.Objects;


public class Location extends Model
{
    private Integer id;
    private String building;
    private String room;
    private Integer roomSize;
    private Date createdAt;
    private Date updatedAt;
    
    public Location(Integer id, String building, String room, Integer roomSize, Date createdAt, Date updatedAt) {
    	this.id = id;
    	this.building = building;
    	this.room = room;
    	this.roomSize = roomSize;
    	this.createdAt = createdAt;
    	this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Integer roomSize) {
        this.roomSize = roomSize;
    }

    public Date getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt()
	{
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt)
	{
		this.updatedAt = updatedAt;
	}

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Location location = (Location) object;
        return java.util.Objects.equals(id, location.id) &&
                java.util.Objects.equals(building, location.building) &&
                java.util.Objects.equals(room, location.room) &&
                java.util.Objects.equals(roomSize, location.roomSize) &&
                java.util.Objects.equals(createdAt, location.createdAt) &&
                java.util.Objects.equals(updatedAt, location.updatedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, building, room, roomSize, createdAt, updatedAt);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Location{" +
                "id=" + id +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", roomSize=" + roomSize +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + updatedAt +
                '}';
    }
}