package com.roger.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
//import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by chenluojie on 2016/7/8.
 */
@SpringBootApplication
//@EnableTurbineStream
@EnableTurbine
@EnableDiscoveryClient
public class Turbine {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Turbine.class).web(true).run(args);
    }
}
