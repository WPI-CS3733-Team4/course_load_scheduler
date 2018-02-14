package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;


public class Location extends Model
{
    private Integer id;
    private String building;
    private String room;
    private Integer roomSize;
    private Instant createdAt;
    private Instant modifiedAt;

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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Instant modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setCreatedAt(Timestamp createdAt)
    {
        if(createdAt != null)
        {
            this.createdAt = createdAt.toInstant();
        }
    }

    public void setUpdatedAt(Timestamp updatedAt)
    {
        if(updatedAt != null)
        {
            this.updatedAt = updatedAt.toInstant();
        }
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
                java.util.Objects.equals(modifiedAt, location.modifiedAt);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), id, building, room, roomSize, createdAt, modifiedAt);
    }
}