package com.roger.spring;

import com.roger.spring.stream.demo.BindingClass;
import com.roger.spring.stream.demo.MyChanels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Import(value ={BindingClass.class})
@RestController
public class CloudStreamApp
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(CloudStreamApp.class).web(true).build().run(args);
    }

    @RequestMapping("/msg")
    public void sendMsg(){
        myChanels.outputChannel().send(MessageBuilder.withPayload("ffff").build());
    }

    @StreamListener(MyChanels.OUTPUT_CHANNEL)
    public void receiver(Message<java.lang.String> message){
        String obj = message.getPayload();
        System.out.println("received msg"+obj);
    }


    @Autowired
    private MyChanels myChanels;





}
