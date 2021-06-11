package com.tingyu.linebot.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jacky
 * @date 2021/6/11
 * @project linebot
 */
@FeignClient(url = "https://api.line.me/v2/bot/")
public interface LineBotV2 {
}
