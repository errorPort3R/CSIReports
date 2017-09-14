package com.porter.csi.dailyreports.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 9/11/17.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean personalReports;

    @Column(nullable = false)
    private boolean allReports;

    public User()
    {
    }

    public User(int id, String username, String password, boolean personalReports, boolean allReports)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.personalReports = personalReports;
        this.allReports = allReports;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isPersonalReports()
    {
        return personalReports;
    }

    public void setPersonalReports(boolean personalReports)
    {
        this.personalReports = personalReports;
    }

    public boolean isAllReports()
    {
        return allReports;
    }

    public void setAllReports(boolean allReports)
    {
        this.allReports = allReports;
    }
}
