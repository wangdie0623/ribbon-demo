package com.wang.spring.ribbon.appb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate template;

    @GetMapping("test")
    public String test() {
        //app-a 为注册在eureka-server中的a服务名称,info为提供的服务地址
        return template.getForObject("http://app-a/info", String.class);
    }
}
