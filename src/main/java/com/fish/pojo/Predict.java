package com.fish.pojo;

import java.util.Date;

public class Predict {
    private Integer id;

    private Integer poolId;

    private Integer userId;

    private Date dateTime;

    private Float predictTotaln;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Float getPredictTotaln() {
        return predictTotaln;
    }

    public void setPredictTotaln(Float predictTotaln) {
        this.predictTotaln = predictTotaln;
    }
}