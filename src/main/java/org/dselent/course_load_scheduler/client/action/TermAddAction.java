package org.dselent.course_load_scheduler.client.action;

public class TermAddAction extends Action
{
    private String termName;

    public TermAddAction(String termName) {
        this.termName = termName;
    }

    public String getTermName() {
        return termName;
    }

    @Override
    public String toString() {
        return "TermAddAction{" +
                "termName='" + termName + '\'' +
                '}';
    }
}
