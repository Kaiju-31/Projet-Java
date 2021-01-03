/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.service;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.repository.ApartmentRepository;
import com.ynov.villageVacance.repository.ComplexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;
    private ComplexRepository complexRepository;

    public ApartmentService(ApartmentRepository apartmentRepository, ComplexRepository complexRepository) {
        this.apartmentRepository = apartmentRepository;
        this.complexRepository = complexRepository;
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

    public Apartment createApartment(Integer bedding, Integer area, Boolean babyEquipments, Boolean airConditioner, Float price, Long complex_id) {
        Complex complex =complexRepository.findComplexById(complex_id);

        Apartment apartment = new Apartment();
        apartment.setAirConditioner(airConditioner);
        apartment.setArea(area);
        apartment.setBabyEquipments(babyEquipments);
        apartment.setBedding(bedding);
        apartment.setPrice(price);
        apartmentRepository.save(apartment);
        complex.getApartments().add(apartment);

        return apartment;
    }


    public void deleteApartment(Long id) {
        Apartment apartment = apartmentRepository.findApartmentById(id);
        apartmentRepository.delete(apartment);
    }

}
