package com.ryan.springboot.dao;

import com.ryan.springboot.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by kaimin on 2017/4/21.
 * time : 下午5:41
 */
public interface CityDao {
    City findById(@Param("id") Long id);
    List<City> findAllCity();
    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);

}
