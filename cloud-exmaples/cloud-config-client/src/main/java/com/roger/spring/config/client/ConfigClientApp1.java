package com.roger.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chenluojie on 2016/7/6.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.roger.spring.config.client"})
@PropertySource(value={"classpath:local.properties"})
public class ConfigClientApp1 {
    public static void main( String[] args )
    {

        SpringApplication.run(ConfigClientApp1.class, args);
    }

}
