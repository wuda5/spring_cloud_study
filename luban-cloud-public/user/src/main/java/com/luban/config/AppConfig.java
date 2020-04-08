package com.luban.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
*  1. 自己配置一个 tomcat 设置端口号 为5000， 避免使用xml
 * 2. 加入一个 RestTemplate 给spirng 管理，用于系统间调用（调用power 系统）
 */
@ComponentScan("com")
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){

        return  new RestTemplate();
    }


    @Bean
    public TomcatServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(5000);
        return  tomcat;
    }
}
