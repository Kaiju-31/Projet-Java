/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Apartment {
//
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer bedding;

    private Integer area;

    private Boolean babyEquipments;

    private Boolean airConditioner;

    private Float price;

    private LocalDate bookingStart;

    private LocalDate bookingEnd;

    public Long getId() {
        return id;
    }

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

    public LocalDate getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(LocalDate bookingStart) {
        this.bookingStart = bookingStart;
    }

    public LocalDate getBookingEnd() {
        return bookingEnd;
    }

    public void setBookingEnd(LocalDate bookingEnd) {
        this.bookingEnd = bookingEnd;
    }

}
