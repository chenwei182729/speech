package com.cninfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cninfo.dao")
@SpringBootApplication(scanBasePackages = {"com.cninfo.data","com.cninfo.service","com.cninfo.controller"})
public class SpringRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisApplication.class, args);
    }

}
