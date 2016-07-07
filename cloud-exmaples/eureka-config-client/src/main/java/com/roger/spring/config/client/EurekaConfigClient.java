package com.roger.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chenluojie on 2016/7/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConfigClient {

    public static void main(String args[]){
       SpringApplication.run(EurekaConfigClient.class,args);
    }
}
