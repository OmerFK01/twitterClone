package com.omerkhanDev.twitterClone.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String handle;
    @Column(nullable = false)
    private String password;

    //Time since last login
    private Date lastLoginDate;

    //Time to display for last login
    private Date DateDisplay;

    //Creation Date of account
    private Date created_Time;

    //different roles that exist
    private String[] roles; //ROLE_USER, ROLE_ADMIN
    //'@ManyToMany(fetch = FetchType.EAGER)
    //private Collection<Roles> roles = new ArrayList<>();

    //Authority assigned to the role of user
    private String[] authorities;

    public User() {
    }

    public User(int id, String email, String handle, String password) {
        this.id = id;
        this.email = email;
        this.handle = handle;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
