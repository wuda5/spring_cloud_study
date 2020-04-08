package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* *  1. 给 user 项目 自己配置一个 tomcat 设置端口号 为 5000， 避免使用xml
 */
@SpringBootApplication
public class AppUserClient {

    public static void main(String[] args) {
        SpringApplication.run(AppUserClient.class);
    }
}
