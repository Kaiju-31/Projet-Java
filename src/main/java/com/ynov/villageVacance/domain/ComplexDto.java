/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.domain;

public class ComplexDto {

    private String type;

    private String region;

    private String address;

    private String gps;

    private Boolean swimmingPool;

    private Boolean spa;

    private Boolean nursery;

    private Boolean wifi;

    private Complex.Location location;

    private String country;


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

    public Complex.Location getLocation() {
        return location;
    }

    public void setLocation(Complex.Location location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ComplexDto(String type, String region, String address, String gps, Boolean swimmingPool, Boolean spa, Boolean nursery, Boolean wifi, Complex.Location location, String country) {
        this.type = type;
        this.region = region;
        this.address = address;
        this.gps = gps;
        this.swimmingPool = swimmingPool;
        this.spa = spa;
        this.nursery = nursery;
        this.wifi = wifi;
        this.location = location;
        this.country = country;
    }

}
