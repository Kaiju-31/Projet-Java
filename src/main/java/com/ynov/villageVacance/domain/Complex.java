/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
public class Complex {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @OneToMany
    @JoinColumn(name = "complex_id")
    private Set<Apartment> apartments;

    public Set<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(Set<Apartment> apartments) {
        this.apartments = apartments;
    }

    private String type;

    private String region;

    private String address;

    private String gps;

    private Boolean swimmingPool;

    private Boolean spa;

    private Boolean nursery;

    private Boolean wifi;

    public enum Location implements Serializable {
        OCEAN,
        SEA,
        MOUNTAIN,
        COUNTRYSIDE,
        CITY
    }

    @Enumerated(EnumType.STRING)
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }


    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Boolean getSpa() {
        return spa;
    }

    public void setSpa(Boolean spa) {
        this.spa = spa;
    }

    public Boolean getNursery() {
        return nursery;
    }

    public void setNursery(Boolean nursery) {
        this.nursery = nursery;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }
}
