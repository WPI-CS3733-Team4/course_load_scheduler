package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.lang.*;
import java.util.Date;
import java.util.Objects;

/* Created by Krishna Madhurkar */

public class CourseDepartment extends Model {
    // attributes

    private Integer id;
    private Integer courseId;
    private Integer departmentId;
    private Integer courseNumber;
    private Date createdAt;
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
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
        CourseDepartment that = (CourseDepartment) object;
        return java.util.Objects.equals(id, that.id) &&
                java.util.Objects.equals(courseId, that.courseId) &&
                java.util.Objects.equals(departmentId, that.departmentId) &&
                java.util.Objects.equals(courseNumber, that.courseNumber) &&
                java.util.Objects.equals(createdAt, that.createdAt) &&
                java.util.Objects.equals(updatedAt, that.updatedAt);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), id, courseId, departmentId, courseNumber, createdAt, updatedAt);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CourseDepartment{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", departmentId=" + departmentId +
                ", courseNumber=" + courseNumber +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}