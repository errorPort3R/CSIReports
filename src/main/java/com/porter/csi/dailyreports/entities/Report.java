package com.porter.csi.dailyreports.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private User user;

    @Column(nullable = false)
    private LocalDate dateOfReport;

    @Column(nullable = false)
    private ArrayList<LocalDate> lastEdited;

    @Column(nullable = false)
    private double temperature;

    @Column(nullable = false)
    private double humidity;

    @Column()
    private String Conditions;

    @Column(nullable = false)
    private String siteSupervisor;

    @Column()
    private ArrayList<String> siteWorkers;

    @Column(nullable = false)
    private ArrayList<Work> workPerformed;

    @Column()
    private ArrayList<Injury> injuries;

    @Column()
    private ArrayList<String> attachments;

    @Column(nullable = false)
    private String jobCode;

    @Column(nullable = false)
    private String jobName;

    public Report()
    {
    }

    public Report(int id, User user, LocalDate dateOfReport, ArrayList<LocalDate> lastEdited, double temperature, double humidity, String conditions, String siteSupervisor, ArrayList<String> siteWorkers, ArrayList<Work> workPerformed, ArrayList<Injury> injuries, ArrayList<String> attachments, String jobCode, String jobName)
    {
        this.id = id;
        this.user = user;
        this.dateOfReport = dateOfReport;
        this.lastEdited = lastEdited;
        this.temperature = temperature;
        this.humidity = humidity;
        Conditions = conditions;
        this.siteSupervisor = siteSupervisor;
        this.siteWorkers = siteWorkers;
        this.workPerformed = workPerformed;
        this.injuries = injuries;
        this.attachments = attachments;
        this.jobCode = jobCode;
        this.jobName = jobName;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public LocalDate getDateOfReport()
    {
        return dateOfReport;
    }

    public void setDateOfReport(LocalDate dateOfReport)
    {
        this.dateOfReport = dateOfReport;
    }

    public ArrayList<LocalDate> getLastEdited()
    {
        return lastEdited;
    }

    public void setLastEdited(ArrayList<LocalDate> lastEdited)
    {
        this.lastEdited = lastEdited;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public double getHumidity()
    {
        return humidity;
    }

    public void setHumidity(double humidity)
    {
        this.humidity = humidity;
    }

    public String getConditions()
    {
        return Conditions;
    }

    public void setConditions(String conditions)
    {
        Conditions = conditions;
    }

    public String getSiteSupervisor()
    {
        return siteSupervisor;
    }

    public void setSiteSupervisor(String siteSupervisor)
    {
        this.siteSupervisor = siteSupervisor;
    }

    public ArrayList<String> getSiteWorkers()
    {
        return siteWorkers;
    }

    public void setSiteWorkers(ArrayList<String> siteWorkers)
    {
        this.siteWorkers = siteWorkers;
    }

    public ArrayList<Work> getWorkPerformed()
    {
        return workPerformed;
    }

    public void setWorkPerformed(ArrayList<Work> workPerformed)
    {
        this.workPerformed = workPerformed;
    }

    public ArrayList<Injury> getInjuries()
    {
        return injuries;
    }

    public void setInjuries(ArrayList<Injury> injuries)
    {
        this.injuries = injuries;
    }

    public ArrayList<String> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(ArrayList<String> attachments)
    {
        this.attachments = attachments;
    }

    public String getJobCode()
    {
        return jobCode;
    }

    public void setJobCode(String jobCode)
    {
        this.jobCode = jobCode;
    }

    public String getJobName()
    {
        return jobName;
    }

    public void setJobName(String jobName)
    {
        this.jobName = jobName;
    }
}
