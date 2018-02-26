package org.dselent.course_load_scheduler.client.model;

import java.util.Date;

/* Created by Nathan Siegel */

public class CourseTime extends Model {

    // Attributes
    private Integer id;
    private Integer courseSectionsId;
    private Integer dayOfWeek;
    private Integer startTime;
    private Integer endTime;
    private Integer locationID;
    private Date createdAt;
    private Date updatedAt;

    
    
    public CourseTime(Integer id, Integer courseSectionsId, Integer dayOfWeek, Integer startTime, Integer endTime,
			Integer locationID, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.courseSectionsId = courseSectionsId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
		this.locationID = locationID;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseSectionsId() {
        return courseSectionsId;
    }

    public void setCourseSectionsId(Integer courseSectionsId) {
        this.courseSectionsId = courseSectionsId;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        CourseTime that = (CourseTime) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (courseSectionsId != null ? !courseSectionsId.equals(that.courseSectionsId) : that.courseSectionsId != null)
            return false;
        if (dayOfWeek != null ? !dayOfWeek.equals(that.dayOfWeek) : that.dayOfWeek != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (locationID != null ? !locationID.equals(that.locationID) : that.locationID != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (courseSectionsId != null ? courseSectionsId.hashCode() : 0);
        result = 31 * result + (dayOfWeek != null ? dayOfWeek.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (locationID != null ? locationID.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "CourseSection{" +
                "id=" + id +
                ", courseSectionsId=" + courseSectionsId +
                ", dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", locationID=" + locationID +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}