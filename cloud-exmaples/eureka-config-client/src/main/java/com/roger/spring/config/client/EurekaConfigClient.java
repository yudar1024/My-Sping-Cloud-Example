package com.roger.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by chenluojie on 2016/7/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
//此注解在远程配置管理数据改变后，通过调用/refresh rest 接口，可以刷新数据值
@RefreshScope
public class EurekaConfigClient {

    public static void main(String args[]){
       SpringApplication.run(EurekaConfigClient.class,args);
    }
}
