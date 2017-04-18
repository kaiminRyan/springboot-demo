package com.ryan.springboot.service;

import com.ryan.springboot.domain.City;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:14
 */
public interface CityService {
    City findCityByName(String cityName);
}
