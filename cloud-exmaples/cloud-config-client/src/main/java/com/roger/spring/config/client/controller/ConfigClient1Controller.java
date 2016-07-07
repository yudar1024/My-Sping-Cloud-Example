package com.roger.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenluojie on 2016/7/6.
 */
@RestController
@RefreshScope
public class ConfigClient1Controller {


    @Value("${hellow}")
    private String hellow;
    @Value("${mes}")
    private String msg;

    @RequestMapping("/remote")
    public String test(){
        return hellow+msg+" cccc";
    }
}
