package com.ryan.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kaimin on 2017/4/21.
 * time : 下午5:34
 */
@SpringBootApplication
@MapperScan("com.ryan.springboot.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
