package com.roger.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chenluojie on 2016/7/8.
 */
@SpringBootApplication
@EnableHystrixDashboard

@ComponentScan(basePackages = {"com.roger.spring.hystrix.controller"})
public class HystrixClientDashBord {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixClientDashBord.class).web(true).run(args);
    }
}
