package com.ryan.springboot.domain;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:14
 */
public class City {
    /**
     * 城市编号
     */
    private Long id;
    private Long province_id;
    private String city_name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Long province_id) {
        this.province_id = province_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
