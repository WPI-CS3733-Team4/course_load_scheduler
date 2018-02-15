package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;


public class Course extends Model
{
    private Integer id;
    private String courseName;
    private String courseDescription;
    private Instant createdAt;
    private Instant updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
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
        Course course = (Course) object;
        return java.util.Objects.equals(id, course.id) &&
                java.util.Objects.equals(courseName, course.courseName) &&
                java.util.Objects.equals(courseDescription, course.courseDescription) &&
                java.util.Objects.equals(createdAt, course.createdAt) &&
                java.util.Objects.equals(updatedAt, course.updatedAt);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), id, courseName, courseDescription, createdAt, updatedAt);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}