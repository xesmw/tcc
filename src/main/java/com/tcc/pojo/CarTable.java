package com.tcc.pojo;

public class CarTable {
    private Integer carId;

    private String carBrand;

    private String carPl;

    private String carUtime;

    private String carOtime;

    private Integer carMoney;

    private String carState;

    private String carType;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarPl() {
        return carPl;
    }

    public void setCarPl(String carPl) {
        this.carPl = carPl == null ? null : carPl.trim();
    }

    public String getCarUtime() {
        return carUtime;
    }

    public void setCarUtime(String carUtime) {
        this.carUtime = carUtime == null ? null : carUtime.trim();
    }

    public String getCarOtime() {
        return carOtime;
    }

    public void setCarOtime(String carOtime) {
        this.carOtime = carOtime == null ? null : carOtime.trim();
    }

    public Integer getCarMoney() {
        return carMoney;
    }

    public void setCarMoney(int carMoney) {
        this.carMoney = carMoney;
    }

    public String getCarState() {
        return carState;
    }

    public void setCarState(String carState) {
        this.carState = carState == null ? null : carState.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }
}