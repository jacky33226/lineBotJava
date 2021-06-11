package com.tingyu.linebot.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author jacky
 * @date 2021/6/11
 * @project linebot
 */
@Data
public class Events {

    //COMMON PROPERTIES

    String replyToken;
    String type;
    String mode;
    Timestamp timestamp;
    Object source;
}
