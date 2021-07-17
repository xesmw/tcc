package com.tcc.pojo;

import java.util.Date;

public class YearTable {
    private Integer yearId;

    private String yearCar;

    private String yearType;

    private Date yearStime;

    private Date yearOtime;

    private Integer yearMoney;

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getYearCar() {
        return yearCar;
    }

    public void setYearCar(String yearCar) {
        this.yearCar = yearCar == null ? null : yearCar.trim();
    }

    public String getYearType() {
        return yearType;
    }

    public void setYearType(String yearType) {
        this.yearType = yearType == null ? null : yearType.trim();
    }

    public Date getYearStime() {
        return yearStime;
    }

    public void setYearStime(Date yearStime) {
        this.yearStime = yearStime;
    }

    public Date getYearOtime() {
        return yearOtime;
    }

    public void setYearOtime(Date yearOtime) {
        this.yearOtime = yearOtime;
    }

    public Integer getYearMoney() {
        return yearMoney;
    }

    public void setYearMoney(Integer yearMoney) {
        this.yearMoney = yearMoney;
    }
}