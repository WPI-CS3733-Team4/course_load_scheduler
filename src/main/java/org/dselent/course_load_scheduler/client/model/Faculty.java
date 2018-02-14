package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;

import java.lang.Override;


public class Faculty extends Model
{
    // attributes

    private Integer id;
    private Integer usersId;
    private Integer requiredCredits;
    private Instant createdAt;
    private Instant updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getRequiredCredits() {
        return requiredCredits;
    }

    public void setRequiredCredits(Integer requiredCredits) {
        this.requiredCredits = requiredCredits;
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

        Faculty faculty = (Faculty) object;

        if (id != null ? !id.equals(faculty.id) : faculty.id != null) return false;
        if (usersId != null ? !usersId.equals(faculty.usersId) : faculty.usersId != null) return false;
        if (requiredCredits != null ? !requiredCredits.equals(faculty.requiredCredits) : faculty.requiredCredits != null)
            return false;
        if (createdAt != null ? !createdAt.equals(faculty.createdAt) : faculty.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(faculty.updatedAt) : faculty.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (usersId != null ? usersId.hashCode() : 0);
        result = 31 * result + (requiredCredits != null ? requiredCredits.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Faculty{" +
                "id=" + id +
                ", usersId=" + usersId +
                ", requiredCredits=" + requiredCredits +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}