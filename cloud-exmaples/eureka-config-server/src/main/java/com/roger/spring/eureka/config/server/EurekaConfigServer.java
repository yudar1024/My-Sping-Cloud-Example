package com.roger.spring.eureka.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by chenluojie on 2016/7/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class EurekaConfigServer {

    public static void main(String args[]){
       SpringApplication.run(EurekaConfigServer.class,args);
    }
}
