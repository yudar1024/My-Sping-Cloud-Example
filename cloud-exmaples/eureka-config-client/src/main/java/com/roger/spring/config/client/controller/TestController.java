package com.roger.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenluojie on 2016/7/7.
 */
@RestController
public class TestController {
    @Value("${hellow}")
    private String hellow;

    @RequestMapping("/test")
    public String test(){
        return hellow;
    }
}
