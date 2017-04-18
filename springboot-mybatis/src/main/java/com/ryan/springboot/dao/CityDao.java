package com.ryan.springboot.dao;

import com.ryan.springboot.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:14
 */
public interface CityDao {

    City findByName(@Param("cityName") String name);
}
