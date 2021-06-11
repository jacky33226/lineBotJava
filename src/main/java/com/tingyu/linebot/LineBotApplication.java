package com.tingyu.linebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jacky
 * @date 2021/6/8
 * @project linebot
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LineBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(LineBotApplication.class, args);
    }
}
