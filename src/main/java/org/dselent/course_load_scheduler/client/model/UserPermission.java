package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.lang.*;

/* Created by Nathan Siegel */

public class Term extends Model {

    // Attributes

    private Integer id;
    private Integer usersId;
    private String role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

        Term term = (Term) object;

        if (id != null ? !id.equals(term.id) : term.id != null) return false;
        if (usersId != null ? !usersId.equals(term.usersId) : term.usersId != null) return false;
        if (role != null ? !role.equals(term.role) : term.role != null) return false;
        if (createdAt != null ? !createdAt.equals(term.createdAt) : term.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(term.updatedAt) : term.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (usersId != null ? usersId.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Term{" +
                "id=" + id +
                ", usersId=" + usersId +
                ", role='" + role + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}