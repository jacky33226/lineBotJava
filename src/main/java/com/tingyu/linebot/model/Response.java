package com.tingyu.linebot.model;

import org.springframework.stereotype.Component;

/**
 * @author jacky
 * @date 2021/6/11
 * @project linebot
 */

@Component
public class Response<T> {

    private int code;

    private T data;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Response success(T data) {
        this.setCode(1);
        this.setData(data);
        this.setMsg("操作成功");
        return this;
    }

    public Response success() {
        this.setCode(1);
        this.setMsg("操作成功");
        return this;
    }

    public Response error(String msg) {
        this.setCode(-1);
        this.setMsg(msg);
        return this;
    }

    public Response error() {
        this.setCode(-1);
        this.setMsg("操作异常");
        return this;
    }

    public Response systemError() {
        this.setCode(-2);
        this.setMsg("系统异常");
        return this;
    }
}