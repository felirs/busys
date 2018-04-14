package com.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xianyang on 2018/jquery_easyui/20.
 */
@Configuration
@EnableAutoConfiguration
@EnableCaching
@ComponentScan(value = "com.bs.*")
@MapperScan(value = "com.bs.biz.mapper.*.*")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
