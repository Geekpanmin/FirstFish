package com.fish.pojo;

import java.util.Date;

public class Pooldata {
    private Integer id;

    private Integer poolId;

    private Float noN;

    private Float nitrareN;

    private Float ph;

    private Float oxygen;

    private Float waterTemperature;

    private Float weatherTemperature;

    private Float totalN;

    private Date dateTime;

    private Integer timeSlot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Float getNoN() {
        return noN;
    }

    public void setNoN(Float noN) {
        this.noN = noN;
    }

    public Float getNitrareN() {
        return nitrareN;
    }

    public void setNitrareN(Float nitrareN) {
        this.nitrareN = nitrareN;
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
    }

    public Float getOxygen() {
        return oxygen;
    }

    public void setOxygen(Float oxygen) {
        this.oxygen = oxygen;
    }

    public Float getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(Float waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public Float getWeatherTemperature() {
        return weatherTemperature;
    }

    public void setWeatherTemperature(Float weatherTemperature) {
        this.weatherTemperature = weatherTemperature;
    }

    public Float getTotalN() {
        return totalN;
    }

    public void setTotalN(Float totalN) {
        this.totalN = totalN;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Integer timeSlot) {
        this.timeSlot = timeSlot;
    }
}