package com.tcc.pojo;

public class PlTable {
    private Integer plId;

    private String plParking;

    private String plState;

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    public String getPlParking() {
        return plParking;
    }

    public void setPlParking(String plParking) {
        this.plParking = plParking == null ? null : plParking.trim();
    }

    public String getPlState() {
        return plState;
    }

    public void setPlState(String plState) {
        this.plState = plState == null ? null : plState.trim();
    }
}