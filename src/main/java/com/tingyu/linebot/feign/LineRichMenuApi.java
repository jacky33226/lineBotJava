package com.tingyu.linebot.feign;

import com.tingyu.linebot.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.http.HttpResponse;

/**
 * @author jacky
 * @date 2021/6/15
 * @project linebot
 */
@FeignClient(name = "LineRichMenuApi",url = "https://api.line.me/v2/bot/richmenu")
public interface LineRichMenuApi {

    @GetMapping("/list")
    Object getRichMenuList(@RequestHeader("Authorization") String authorization);
}
