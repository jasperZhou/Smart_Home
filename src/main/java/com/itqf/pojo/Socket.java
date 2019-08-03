package com.itqf.pojo;

public class Socket {
    private Integer socketid;

    private String socketimg;

    private String status;

    public Integer getSocketid() {
        return socketid;
    }

    public void setSocketid(Integer socketid) {
        this.socketid = socketid;
    }

    public String getSocketimg() {
        return socketimg;
    }

    public void setSocketimg(String socketimg) {
        this.socketimg = socketimg == null ? null : socketimg.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}