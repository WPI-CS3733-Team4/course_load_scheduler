package org.dselent.course_load_scheduler.client.model;

import java.util.Date;

/* Created by Nathan Siegel */
/* Modified by Krishna Madhurkar */

public class Term extends Model {

    //attributes

    private Integer id;
    private String termName;
    private Date createdAt;
    private Date updatedAt;
	
	// For testing
	public Term(Integer id, String userName, Date createdAt, Date updatedAt) {
		this.id = id;
		this.termName = userName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		
	
	}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
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

        Term term = (Term) object;

        if (id != null ? !id.equals(term.id) : term.id != null) return false;
        if (termName != null ? !termName.equals(term.termName) : term.termName != null) return false;
        if (createdAt != null ? !createdAt.equals(term.createdAt) : term.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(term.updatedAt) : term.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (termName != null ? termName.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Term{" +
                "id=" + id +
                ", termName='" + termName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}