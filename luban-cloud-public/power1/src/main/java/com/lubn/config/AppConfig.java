package com.lubn.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
* 模拟 power 集群服务，端口601
 */
@ComponentScan("com")
@Configuration

public class AppConfig {


//    因为在配置文件中配置了port 了，就不需要用java配置
//    @Bean
//    public TomcatServletWebServerFactory tomcat(){
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.setPort(601);
//        return  tomcat;
//    }
}
