/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.domain;

import java.time.LocalDate;

public class ApartmentDto {

    private Integer bedding;

    private Integer area;

    private Boolean babyEquipments;

    private Boolean airConditioner;

    private Float price;

    private LocalDate booking;

    private String complexType;

    public Integer getBedding() {
        return bedding;
    }

    public void setBedding(Integer bedding) {
        this.bedding = bedding;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Boolean getBabyEquipments() {
        return babyEquipments;
    }

    public void setBabyEquipments(Boolean babyEquipments) {
        this.babyEquipments = babyEquipments;
    }

    public Boolean getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getBooking() {
        return booking;
    }

    public void setBooking(LocalDate booking) {
        this.booking = booking;
    }

    public String getComplexType() {
        return complexType;
    }

    public void setComplexType(String complexType) {
        this.complexType = complexType;
    }

    public ApartmentDto(Integer bedding, Integer area, Boolean babyEquipments, Boolean airConditioner, Float price, LocalDate booking, String complexType) {
        this.bedding = bedding;
        this.area = area;
        this.babyEquipments = babyEquipments;
        this.airConditioner = airConditioner;
        this.price = price;
        this.booking = booking;
        this.complexType = complexType;
    }
}
