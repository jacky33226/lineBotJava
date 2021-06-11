package com.tingyu.linebot.controller;

import com.tingyu.linebot.model.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jacky
 * @date 2021/6/11
 * @project linebot
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
