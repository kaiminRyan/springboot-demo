package com.ryan.springboot.dao.master;

import com.ryan.springboot.domain.City;
import com.ryan.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by kaimin on 2017/4/18.
 * time : 下午4:14
 */
@Mapper
public interface UserDao {

    User findByName(@Param("username") String name);
}
