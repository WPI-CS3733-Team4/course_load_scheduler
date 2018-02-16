package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.lang.*;
import java.util.Objects;

/* Created by Nathan Siegel */

public class CourseSectionTerm extends Model {

    // Attributes
    private Integer id;
    private Integer courseSectionsId;
    private Integer termsId;
    private Instant createdAt;
    private Instant updatedAt;

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

    public Integer getTermsId() {
        return termsId;
    }

    public void setTermsId(Integer termsId) {
        this.termsId = termsId;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CourseSectionTerm that = (CourseSectionTerm) object;
        return java.util.Objects.equals(id, that.id) &&
                java.util.Objects.equals(courseSectionsId, that.courseSectionsId) &&
                java.util.Objects.equals(termsId, that.termsId) &&
                java.util.Objects.equals(createdAt, that.createdAt) &&
                java.util.Objects.equals(updatedAt, that.updatedAt);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), id, courseSectionsId, termsId, createdAt, updatedAt);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CourseSectionTerm{" +
                "id=" + id +
                ", courseSectionsId=" + courseSectionsId +
                ", termsId=" + termsId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
