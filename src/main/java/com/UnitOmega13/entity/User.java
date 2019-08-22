package com.UnitOmega13.entity;

public class User {
    private Long id;

    private String email;

    private String login;

    private String password;

    private String accessRole;


    public User(String email, String password, String accessRole, String login) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.accessRole = accessRole;
    }

    public User(long id, String email, String login, String password, String accessRole) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.accessRole = accessRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessRole() {
        return accessRole;
    }

    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }
}
