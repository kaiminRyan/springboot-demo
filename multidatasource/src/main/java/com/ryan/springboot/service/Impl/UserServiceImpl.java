package com.ryan.springboot.service.Impl;

import com.ryan.springboot.dao.cluster.CityDao;
import com.ryan.springboot.dao.master.UserDao;
import com.ryan.springboot.domain.City;
import com.ryan.springboot.domain.User;
import com.ryan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private CityDao cityDao;

    @Override
    public User findUserByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("杭州");
        user.setCity(city);
        return user;
    }
}
