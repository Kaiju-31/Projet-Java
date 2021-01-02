/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.service;

import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.repository.ComplexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplexService {
    private final ComplexRepository complexRepository;

    public ComplexService(ComplexRepository complexRepository) {
        this.complexRepository = complexRepository;
    }

    public List<Complex> getComplexs() {
        return complexRepository.findAll();
    }

    public void generateComplexs() {
        Complex complex = new Complex();
        complex.setAddress("essai");
        complex.setGps("315246");
        complex.setLocation(Complex.Location.MOUNTAIN);
        complex.setNursery(false);
        complex.setRegion("tarn");
        complex.setSpa(true);
        complex.setWifi(true);
        complex.setSwimmingPool(true);
        complex.setType("Village Vacance");
        complexRepository.save(complex);
    }
}
