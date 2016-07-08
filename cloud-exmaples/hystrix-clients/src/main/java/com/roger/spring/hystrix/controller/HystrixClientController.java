package com.roger.spring.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenluojie on 2016/7/8.
 */
@RestController
public class HystrixClientController {

    @RequestMapping("/break/{id}")
    @HystrixCommand(fallbackMethod = "defaultStores")
    public String breakPoint(@PathVariable("id") String id) {
        throw new RuntimeException("test fail");
    }

    public String defaultStores(String id) {
        return id;
    }
}
