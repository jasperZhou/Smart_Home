package com.itqf.pojo;

public class Robot {
    private Integer robotid;

    private String aiimg;

    private String status;

    public Integer getRobotid() {
        return robotid;
    }

    public void setRobotid(Integer robotid) {
        this.robotid = robotid;
    }

    public String getAiimg() {
        return aiimg;
    }

    public void setAiimg(String aiimg) {
        this.aiimg = aiimg == null ? null : aiimg.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}