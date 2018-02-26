package org.dselent.course_load_scheduler.client.action;

public class UserModifyAction extends Action
{
    private Integer userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserModifyAction(Integer userId, String userName, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "\'userId\'=\'" + userId +
                ", \'userName\'=\'" + userName + '\'' +
                ", \'firstName\'=\'" + firstName + '\'' +
                ", \'lastName\'=\'" + lastName + '\'' +
                ", \'email\'=\'" + email + '\'' +
                ", \'password=\'" + password + '\'' +
                '}';
    }
}
