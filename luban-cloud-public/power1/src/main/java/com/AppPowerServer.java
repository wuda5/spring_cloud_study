package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* 赋值了一份power 模拟集群--》设置端口为 602
 */
@SpringBootApplication
public class AppPowerServer {

    public static void main(String[] args) {
        SpringApplication.run(AppPowerServer.class);
    }
}
