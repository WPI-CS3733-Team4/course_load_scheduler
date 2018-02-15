package org.dselent.course_load_scheduler.client.action;

public class TermRemoveAction
{
    private Integer termId;

    public TermRemoveAction(Integer termId) {
        this.termId = termId;
    }

    public Integer getTermId() {
        return termId;
    }

    @Override
    public String toString() {
        return "TermRemoveAction{" +
                "termId=" + termId +
                '}';
    }
}
