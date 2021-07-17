package com.tcc.pojo;

public class FreeTable {
    private Integer freeId;

    private String freeCar;

    private String freeType;

    public Integer getFreeId() {
        return freeId;
    }

    public void setFreeId(Integer freeId) {
        this.freeId = freeId;
    }

    public String getFreeCar() {
        return freeCar;
    }

    public void setFreeCar(String freeCar) {
        this.freeCar = freeCar == null ? null : freeCar.trim();
    }

    public String getFreeType() {
        return freeType;
    }

    public void setFreeType(String freeType) {
        this.freeType = freeType == null ? null : freeType.trim();
    }
}