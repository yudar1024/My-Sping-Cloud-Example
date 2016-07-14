package com.roger.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenluojie on 2016/7/13.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class FeignService {
    @Autowired
    DiscoveryClient client;

    @RequestMapping("/")
    public String hello() {
        ServiceInstance localInstance = client.getLocalServiceInstance();
        return "Hello World: "+ localInstance.getServiceId()+":"+localInstance.getHost()+":"+localInstance.getPort();
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignService.class, args);
    }
}
