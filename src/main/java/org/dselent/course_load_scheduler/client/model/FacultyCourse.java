package org.dselent.course_load_scheduler.client.model;

import java.util.Date;

/* Created by Nathan Siegel */

public class FacultyCourse extends Model {
    // attributes

    private Integer id;
    private Integer facultyID;
    private Integer courseSectionID;
    private Date createdAt;
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(Integer facultyID) {
        this.facultyID = facultyID;
    }

    public Integer getCourseSectionID() {
        return courseSectionID;
    }

    public void setCourseSectionID(Integer courseSectionID) {
        this.courseSectionID = courseSectionID;
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

        FacultyCourse that = (FacultyCourse) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (facultyID != null ? !facultyID.equals(that.facultyID) : that.facultyID != null) return false;
        if (courseSectionID != null ? !courseSectionID.equals(that.courseSectionID) : that.courseSectionID != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (facultyID != null ? facultyID.hashCode() : 0);
        result = 31 * result + (courseSectionID != null ? courseSectionID.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FacultyCourse{" +
                "id=" + id +
                ", facultyID=" + facultyID +
                ", courseSectionID=" + courseSectionID +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}