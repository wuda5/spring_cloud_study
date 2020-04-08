package com.lubn.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *  1. 给power 项目 自己配置一个 tomcat 设置端口号 为 6000， 避免使用xml
 */
@ComponentScan("com")
@Configuration
public class AppConfig {


    @Bean
    public TomcatServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(600);
        return  tomcat;
    }
}
