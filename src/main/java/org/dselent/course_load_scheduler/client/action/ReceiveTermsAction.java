
package org.dselent.course_load_scheduler.client.action;

/* Created by Krishna Madhurkar */

public class ReceiveTermsAction extends Action
{
    private Integer termId;
    private String termName;

    public ReceiveTermsAction(Integer termId, String termName) {
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
