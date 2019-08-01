package com.itqf.util;

import java.util.List;

/**
 * 2019/7/8
 * Administrator
 * springboot0708
 * 面向对象面向君  不负代码不负卿
 */
public class DataView<T> {
    private int code;
    private String msg;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
