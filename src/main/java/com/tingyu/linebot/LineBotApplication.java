package com.tingyu.linebot;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jacky
 * @date 2021/6/8
 * @project linebot
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@LineMessageHandler
public class LineBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(LineBotApplication.class, args);
    }


}
