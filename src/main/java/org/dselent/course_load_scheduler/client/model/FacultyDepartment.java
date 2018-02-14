package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.lang.*;

/* Created by Nathan Siegel */

public class FacultyDepartment extends Model {
    // attributes

    private Integer id;
    private Integer facultyID;
    private Integer departmentsID;
    private Instant createdAt;
    private Instant updatedAt;

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

    public Integer getDepartmentsID() {
        return departmentsID;
    }

    public void setDepartmentsID(Integer departmentsID) {
        this.departmentsID = departmentsID;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedAt(Timestamp createdAt)
    {
        if(createdAt != null)
        {
            this.createdAt = createdAt.toInstant();
        }
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt)
    {
        if(updatedAt != null)
        {
            this.updatedAt = updatedAt.toInstant();
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        FacultyDepartment that = (FacultyDepartment) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (facultyID != null ? !facultyID.equals(that.facultyID) : that.facultyID != null) return false;
        if (departmentsID != null ? !departmentsID.equals(that.departmentsID) : that.departmentsID != null)
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
        result = 31 * result + (departmentsID != null ? departmentsID.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "FacultyDepartment{" +
                "id=" + id +
                ", facultyID=" + facultyID +
                ", departmentsID=" + departmentsID +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}