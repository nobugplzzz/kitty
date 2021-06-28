package com.luqiyu.kitty.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author: 启誉
 * @create: 2021-06-26
 **/
//@MapperScan(basePackages = "com.luqiyu.kitty.admin.dao")下面这行已经扫描mapper
//@SpringBootApplication(scanBasePackages = {"com.luqiyu.kitty"})全都使用注解后也不需要这个了，springboot会自动扫描
@SpringBootApplication
public class KittyAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(KittyAdminApplication.class,args);
    }
}
