package com.roger.spring.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chenluojie on 2016/7/8.
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableHystrix
@ComponentScan(basePackages = {"com.roger.spring.hystrix.controller"})
public class HystrixClientPush {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixClientPush.class).web(true).run(args);
    }
}
