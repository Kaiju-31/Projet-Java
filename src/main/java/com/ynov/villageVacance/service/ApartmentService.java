/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.service;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.repository.ApartmentRepository;
import com.ynov.villageVacance.repository.ComplexRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
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

    public List<Apartment> getApartmentById(Long id) {
        return apartmentRepository.getApartmentById(id);
    }

    public List<Apartment> getApartmentByDate(LocalDate bookingstart, LocalDate bookingend) {
        return apartmentRepository.getApartmentByDate(bookingstart, bookingend);
    }

    public void generateApartments() {
        Apartment apartment = new Apartment();
        apartment.setAirConditioner(true);
        apartment.setArea(30);
        apartment.setBabyEquipments(true);
        apartment.setBedding(2);
        apartment.setPrice((float) 50);
        apartment.setBookingStart(LocalDate.of(2021,1,1));
        apartment.setBookingEnd(LocalDate.of(2021,1,15));
        apartmentRepository.save(apartment);
    }

    public Apartment createApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public Apartment updateApartment(Apartment apartment, Long id) {
        apartmentRepository.findApartmentById(id);
        return apartmentRepository.save(apartment);
    }

    public void deleteApartment(Long id) {
        Apartment apartment = apartmentRepository.findApartmentById(id);
        apartmentRepository.delete(apartment);
    }

//    public List<ApartmentDto> findApartmentByRegion(String region) {
//        return apartmentRepository.findApartmentByRegion(region);
//    }
}
