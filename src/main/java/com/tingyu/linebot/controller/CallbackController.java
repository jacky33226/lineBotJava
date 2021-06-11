package com.tingyu.linebot.controller;

import com.alibaba.fastjson.JSONObject;
import com.tingyu.linebot.model.CallbackConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

/**
 * @author jacky
 * @date 2021/6/8
 * @project linebot
 */
@RestController
public class CallbackController {

    @PostMapping("/callback")
    public String callback(HttpServletRequest request, CallbackConfig callbackConfig){

        try {

            System.out.println(JSONObject.toJSONString(request.getHeaderNames()));

            String test = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println(test);

            System.out.println(JSONObject.toJSONString(callbackConfig));

            return "success";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "success";
    }


}
