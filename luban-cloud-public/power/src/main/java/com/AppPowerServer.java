package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  1. 给power 项目 自己配置一个 tomcat 设置端口号 为 600， 避免使用xml
 */
@SpringBootApplication
public class AppPowerServer {

    public static void main(String[] args) {
        SpringApplication.run(AppPowerServer.class);
    }
}
