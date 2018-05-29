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
        return template.getForObject("http://app-a/info", String.class);
    }
}
