package com.roger.spring.stream.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by chenluojie on 2016/7/25.
 */
public interface MyChanels  {

    public static final String  INPUT_CHANEL="input_channel";

    public static final String  OUTPUT_CHANNEL="output_channel";

    public static final String  INPUT1="input1";

    public static final String  OUTPUT1="output1";

    @Input("input_channel")
    SubscribableChannel inputChannel();

    @Output("output_channel")
    MessageChannel outputChannel();

    @Input("input1")
    SubscribableChannel input1();

    @Output("output1")
    MessageChannel output1();

}
