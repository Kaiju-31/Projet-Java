package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Country implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ID")
//    @OneToOne
//    @JoinColumn(name = "COUNTRY_ID")
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
