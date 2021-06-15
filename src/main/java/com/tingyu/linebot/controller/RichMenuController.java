package com.tingyu.linebot.controller;

import com.alibaba.fastjson.JSONObject;
import com.tingyu.linebot.feign.LineRichMenuApi;
import com.tingyu.linebot.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

/**
 * @author jacky
 * @date 2021/6/15
 * @project linebot
 */
@RestController
public class RichMenuController {

    @Autowired
    LineRichMenuApi lineRichMenuApi;

    @Value("${line.bot.channel-token}")
    String token;

    @GetMapping("/richMenu")
    public Response getRichMenuList(){

        Object response = lineRichMenuApi.getRichMenuList("Bearer "+token);

        System.out.println(response.toString());
        System.out.println(JSONObject.toJSONString(response));
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(response));


        return new Response().success(jsonObject);
    }
}
