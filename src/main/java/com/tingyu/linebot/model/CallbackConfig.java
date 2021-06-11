package com.tingyu.linebot.model;

import lombok.Data;

/**
 * @author jacky
 * @date 2021/6/11
 * @project linebot
 */
@Data
public class CallbackConfig {

    String destination;
    Object events;

}
