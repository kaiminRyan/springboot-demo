package com.ryan.springboot.controller;

import com.ryan.springboot.domain.User;
import com.ryan.springboot.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午8:01
 */
@RestController
public class UserResultController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user",method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "username", required = true)String name){
        return userService.findUserByName(name);
    }
}
