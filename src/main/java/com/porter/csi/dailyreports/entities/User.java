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


}
