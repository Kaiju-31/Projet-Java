package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Complex implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

//    @Column(name = "COUNTRY_ID")
//    @OneToOne
//    @JoinColumn(name = "ID")
    private String country_id;

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

    public Long getId() {
        return id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
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
