package org.example.model.tienda;

public class User {
    String userId;
    String userPasword;

    public User(String userId, String userPasword) {
        this.userId = userId;
        this.userPasword = userPasword;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPasword() {
        return userPasword;
    }
}
