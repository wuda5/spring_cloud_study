package com.luban.controller;

import com.luban.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 *  1. user 服务自己配置一个 tomcat 设置端口号 为5000， 避免使用xml
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 测试 自己服务
     * **/
    @RequestMapping("/getUser.do")
    public R getUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","user");

        return R.success("返回成功",map);
    }

/**
 * 测试 微服务间通过 restTemplate 方式 url 来调用（不借助外部框架）--power服务的端口是 600
 * */
    @RequestMapping("/getPower.do")
    public R getPower(){
        System.out.println("user 请求到达--> /getPower.do");
        return R.success("操作成功",restTemplate.getForObject("http://localhost:600/getPower.do",Object.class));
    }

}
