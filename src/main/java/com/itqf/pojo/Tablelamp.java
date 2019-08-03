package com.itqf.pojo;

public class Tablelamp {
    private Integer tablelampid;

    private String name;

    private Integer temperature;

    private Integer state;



    private Integer lightness;

    private String url;

    private Integer electricity;

    private Integer hour;

    public Integer getTablelampid() {
        return tablelampid;
    }

    public void setTablelampid(Integer tablelampid) {
        this.tablelampid = tablelampid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLightness() {
        return lightness;
    }

    public void setLightness(Integer lightness) {
        this.lightness = lightness;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getElectricity() {
        return electricity;
    }

    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}