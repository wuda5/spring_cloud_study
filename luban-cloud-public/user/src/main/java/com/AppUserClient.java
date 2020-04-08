package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* *  1. 给 user 项目 自己配置一个 tomcat 设置端口号 为 5000， 避免使用xml
 *-------------------------------------------
 * 2.采用了eureka 作为注册中心，配置文件中配置端口了，去掉1
 *
 * 2.2. pom 导入 eureka 【 客户端 】的依赖： spring-cloud-starter-netflix-eureka-client
 * (对于注册中心加入的这些服务来说都是其连接的 客户端，注册中心 eureka 服务才是 服务端--> 那里才需要导入 eureka 【服务端】的jar依赖)
 *
 * 2.3 启动类加 @EnableEurekaClient 注解--》
 */

@SpringBootApplication
@EnableEurekaClient
public class AppUserClient {

    public static void main(String[] args) {
        SpringApplication.run(AppUserClient.class);
    }
}
