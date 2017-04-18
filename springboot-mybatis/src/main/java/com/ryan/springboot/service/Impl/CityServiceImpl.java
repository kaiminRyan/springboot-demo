package com.ryan.springboot.service.Impl;

import com.ryan.springboot.dao.CityDao;
import com.ryan.springboot.domain.City;
import com.ryan.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:15
 */
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;
    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
