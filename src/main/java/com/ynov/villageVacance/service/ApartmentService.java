/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.service;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.repository.ApartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public List<Apartment> getApartments() {
        return apartmentRepository.findAll();
    }

    public void generateApartments() {
        Apartment apartment = new Apartment();
        apartment.setAirConditioner(true);
        apartment.setArea(30);
        apartment.setBabyEquipments(true);
        apartment.setBedding(2);
        apartment.setPrice((float) 50);
        apartmentRepository.save(apartment);
    }

}
