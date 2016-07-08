package com.roger.spring.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chenluojie on 2016/7/8.
 */
@SpringBootApplication
@EnableCircuitBreaker
@ComponentScan(basePackages = {"com.roger.spring.hystrix.controller"})
public class HystrixClient {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixClient.class).web(true).run(args);
    }
}
