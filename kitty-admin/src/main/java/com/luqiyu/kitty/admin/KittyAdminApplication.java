package com.luqiyu.kitty.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author: 启誉
 * @create: 2021-06-26
 **/
//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"com.luqiyu.kitty"})
public class KittyAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(KittyAdminApplication.class,args);
    }
}
