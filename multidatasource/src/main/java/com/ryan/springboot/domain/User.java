package com.ryan.springboot.domain;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午7:52
 */
public class User {
    private long id;
    private String username;
    private String description;

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
