/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Country {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "country_id")
    private Set<Complex> complexs;

    public Set<Complex> getComplexs() {
        return complexs;
    }

    public void setComplexs(Set<Complex> complexs) {
        this.complexs = complexs;
    }

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
