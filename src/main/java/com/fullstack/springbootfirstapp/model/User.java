package com.fullstack.springbootfirstapp.model;

public class User {
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String email, String passwd) {
        this.name=name;
        this.email=email;
        this.password=passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
