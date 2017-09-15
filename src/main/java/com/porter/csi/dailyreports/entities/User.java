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
    private boolean fieldSupervisor;

    @Column(nullable = false)
    private boolean manager;

    @Column(nullable = false)
    private boolean superUser;

    public User()
    {
    }

    public User(int id, String username, String password, boolean fieldSupervisor, boolean manager, boolean superUser)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fieldSupervisor = fieldSupervisor;
        this.manager = manager;
        this.superUser = superUser;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public boolean isFieldSupervisor()
    {
        return fieldSupervisor;
    }

    public void setFieldSupervisor(boolean fieldSupervisor)
    {
        this.fieldSupervisor = fieldSupervisor;
    }

    public boolean isManager()
    {
        return manager;
    }

    public void setManager(boolean manager)
    {
        this.manager = manager;
    }

    public boolean isSuperUser()
    {
        return superUser;
    }

    public void setSuperUser(boolean superUser)
    {
        this.superUser = superUser;
    }
}
