package com.porter.csi.dailyreports.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 9/13/17.
 */
@Entity
@Table(name = "reports")
public class Report
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    User user;




}
