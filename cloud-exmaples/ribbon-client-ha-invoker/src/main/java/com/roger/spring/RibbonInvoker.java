package com.roger.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;

/**
 * Created by chenluojie on 2016/7/11.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RibbonInvoker {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    @LoadBalanced
    RestTemplate client;

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


    public static void main(String [] args){
        new SpringApplicationBuilder(RibbonInvoker.class).web(true).run(args);
    }

    @RequestMapping("/ribbon")
    public String test(){
        String res="";
//        ServiceInstance serviceInstance= loadBalancerClient.choose("ribbon-client");
//        String res=serviceInstance.getUri()+" id = "+serviceInstance.getServiceId();
//        Iterator<String> keys = serviceInstance.getMetadata().keySet().iterator();
//        while(keys.hasNext()){
//            String key=serviceInstance.getMetadata().keySet().iterator().next();
//            res= res+ "#######"+key+" : "+serviceInstance.getMetadata().get(key)+", ";
//        }
        String ccc=client.getForObject("http://ribbon-client/break/1",String.class);
        return res+ccc;
    }

    @RequestMapping("/say")
    public String say(){
        String res="";
//        ServiceInstance serviceInstance= loadBalancerClient.choose("ribbon-client");
//        String res=serviceInstance.getUri()+" id = "+serviceInstance.getServiceId();
//        Iterator<String> keys = serviceInstance.getMetadata().keySet().iterator();
//        while(keys.hasNext()){
//            String key=serviceInstance.getMetadata().keySet().iterator().next();
//            res= res+ "#######"+key+" : "+serviceInstance.getMetadata().get(key)+", ";
//        }
        String ccc=client.getForObject("http://ribbon-client/say",String.class);
        return res+ccc;
    }
}
