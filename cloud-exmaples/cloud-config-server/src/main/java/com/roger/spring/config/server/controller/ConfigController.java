package com.roger.spring.config.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenluojie on 2016/7/6.
 */
public class ConfigController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplateLB;

    @Autowired
    private RestTemplate restTemplate;


    public String doOtherStuff() {
        // 使用lb 的template URI 使用的是服务名，而不是域名或者IP
        return restTemplateLB.getForObject("http://stores/stores", String.class);
    }

    public String doStuff() {
        return restTemplate.getForObject("http://example.com", String.class);
    }
}
