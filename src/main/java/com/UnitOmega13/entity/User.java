package com.UnitOmega13.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "users", schema = "shop")
@PrimaryKeyJoinColumn(name = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "accessRole")
    private String accessRole;

    public User () {}

    public User(String email, String password, String login) {
        this.email = email;
        this.password = password;
        this.login = login;
    }

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
