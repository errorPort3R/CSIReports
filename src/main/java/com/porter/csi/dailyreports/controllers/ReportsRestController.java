package com.porter.csi.dailyreports.controllers;

import com.porter.csi.dailyreports.entities.User;
import com.porter.csi.dailyreports.services.ReportRepository;
import com.porter.csi.dailyreports.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jeffryporter on 9/11/17.
 */
@RestController
public class ReportsRestController
{
    @Autowired
    UserRepository users;

    @Autowired
    ReportRepository reports;

    //***************************************************************************************
    //
    //               USER Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public Iterable<User> getUsers()
    {
        return users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public void editUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id)
    {
        users.delete(id);
    }

    @RequestMapping(path = "/#/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id)
    {
        return users.findOne(id);
    }
}
