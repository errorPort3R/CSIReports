package com.porter.csi.dailyreports.entities;

/**
 * Created by jeffryporter on 9/14/17.
 */
public class Work
{
    private String elevation;

    private String workPerformed;

    public Work()
    {
    }

    public Work(String elevation, String workPerformed)
    {
        this.elevation = elevation;
        this.workPerformed = workPerformed;
    }

    public String getElevation()
    {
        return elevation;
    }

    public void setElevation(String elevation)
    {
        this.elevation = elevation;
    }

    public String getWorkPerformed()
    {
        return workPerformed;
    }

    public void setWorkPerformed(String workPerformed)
    {
        this.workPerformed = workPerformed;
    }
}
