package com.roger.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenluojie on 2016/7/7.
 */
@RestController
//此注解在远程配置管理数据改变后，通过调用/refresh rest 接口，可以刷新数据值
@RefreshScope
public class TestController {
    @Value("${hellow}")
    private String hellow;

    @RequestMapping("/test")
    public String test(){
        return hellow;
    }
}
