package org.dselent.course_load_scheduler.client.action;

public class SendTermAddAction {

    private String termName;

    public SendTermAddAction(String termName){
        this.termName = termName;
    }

    public String getTermName() {
        return termName;
    }

    @Override
    public String toString() {
        return "SendTermAddAction{" +
                "termName='" + termName + '\'' +
                '}';
    }
}
