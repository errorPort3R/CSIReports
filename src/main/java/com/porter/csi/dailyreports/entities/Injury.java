package com.porter.csi.dailyreports.entities;

/**
 * Created by jeffryporter on 9/14/17.
 */
public class Injury
{
    private String name;

    private String description;

    public Injury()
    {
    }

    public Injury(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
