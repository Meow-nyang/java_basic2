package oop.encap.practice;

public class PasswordManager {

    private String password;

    public PasswordManager(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
}
