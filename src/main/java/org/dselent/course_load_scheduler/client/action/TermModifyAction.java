package org.dselent.course_load_scheduler.client.action;

public class TermModifyAction extends Action
{
    private Integer termId;
    private String termName;

    public TermModifyAction(Integer termId, String termName) {
        this.termId = termId;
        this.termName = termName;
    }

    public Integer getTermId() {
        return termId;
    }

    public String getTermName() {
        return termName;
    }

    @Override
    public String toString() {
        return "{"+
                "\'termId\'=\'"+termId+"\'"+
                ",\'termName\'=\'"+termName+"\'"+
                '}';
    }
}
