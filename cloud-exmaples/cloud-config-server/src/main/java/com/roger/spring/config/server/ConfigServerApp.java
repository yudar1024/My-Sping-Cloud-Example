package com.roger.spring.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenluojie on 2016/7/6.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
    public static void main( String[] args )
    {

        SpringApplication.run(ConfigServerApp.class, args);
    }

    // 配置RestTemplate 启用Ribbon 的lb， 在IOC 中，需要时用LB的RestTemplate 在字段上添加@LoadBalanced
    @LoadBalanced
    @Bean
    RestTemplate loadBalanced() {
        return new RestTemplate();
    }

    // 配置 正常的RestTemplate @Primary 用于消除歧义
    @Primary
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
