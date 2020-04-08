package com.luban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* 依赖里有用    <dependencyManagement>
 *
 * (对于注册中心加入的这些服务来说都是其连接的 客户端，注册中心 eureka 服务才是 服务端--> 那里才需要导入 eureka 【服务端】的jar依赖)
 * 所以这里启动类 配置注解 --》eureka 服务端注解
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka3000 {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka3000.class);
    }
}
