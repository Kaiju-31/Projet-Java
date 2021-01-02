package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
public class Apartment implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long complex_id;

    private Integer bedding;

    private Integer area;

    private Boolean babyEquipments;

    private Boolean airConditioner;

    private Float price;

    private LocalDate booking;

    public Long getId() {
        return id;
    }

    public Long getComplex_id() {
        return complex_id;
    }

    public void setComplex_id(Long complex_id) {
        this.complex_id = complex_id;
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

    public LocalDate getBooking() {
        return booking;
    }

    public void setBooking(LocalDate booking) {
        this.booking = booking;
    }
}
