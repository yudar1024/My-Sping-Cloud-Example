package com.roger.spring.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by chenluojie on 2016/7/7.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer1.class).web(true).run(args);
    }
}
