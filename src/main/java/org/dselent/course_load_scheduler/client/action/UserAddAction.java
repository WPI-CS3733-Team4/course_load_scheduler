package org.dselent.course_load_scheduler.client.action;

public class UserAddAction extends Action
{
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserAddAction(String userName, String firstName, String lastName, String email, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "{\'userName\'=\'" + this.userName + '\'' +
                ", \'firstName\'=\'" + this.firstName + '\'' +
                ", \'lastName\'=\'" + this.lastName + '\'' +
                ", \'email\'=\'" + this.email + '\'' +
                ", \'password\'=\'" + this.password + '\'' +
                "}";
    }
}
