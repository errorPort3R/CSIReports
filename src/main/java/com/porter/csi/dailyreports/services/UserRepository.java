package com.porter.csi.dailyreports.services;

import com.porter.csi.dailyreports.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 9/11/17.
 */
public interface UserRepository extends CrudRepository<User, Integer>
{
}
