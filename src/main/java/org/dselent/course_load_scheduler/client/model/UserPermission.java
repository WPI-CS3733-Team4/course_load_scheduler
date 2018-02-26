package org.dselent.course_load_scheduler.client.model;

import java.util.Date;
import java.util.Objects;

/* Created by Nathan Siegel */

public class UserPermission extends Model {

    // Attributes

    private Integer id;
    private Integer usersId;
    private String role;
    private Date createdAt;
    private Date updatedAt;
    
    public UserPermission(Integer id, Integer usersId, String role, Date createdAt, Date updatedAt) {
    	this.id = id;
    	this.usersId = usersId;
    	this.role = role;
    	this.createdAt = createdAt;
    	this.updatedAt = updatedAt;
    }
    
    // For testing
    public UserPermission(Integer id, Integer usersId, String role) {
    	this.id = id;
    	this.usersId = usersId;
    	this.role = role;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPermission that = (UserPermission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(usersId, that.usersId) &&
                Objects.equals(role, that.role) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
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