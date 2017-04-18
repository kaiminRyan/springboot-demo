package com.ryan.springboot.controller;

import com.ryan.springboot.domain.City;
import com.ryan.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:12
 */
@RestController
public class CityResultController {
    @Autowired
    private CityService cityService;
    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public City findCityByName(@RequestParam(value = "cityName",required = true) String name){
        return cityService.findCityByName(name);
    }
}
