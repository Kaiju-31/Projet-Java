/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.service.ApartmentService;
import com.ynov.villageVacance.service.ComplexService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class ApartmentController {

    ApartmentService apartmentService;
    ComplexService complexService;
    public ApartmentController(ApartmentService apartmentService, ComplexService complexService) {
        this.apartmentService = apartmentService;
        this.complexService = complexService;
    }

    @GetMapping("/apartment")
    @ResponseStatus(HttpStatus.OK)
    public List<Apartment> getApartments() {
        return apartmentService.getApartments();
    }

    @GetMapping("/apartment/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateApartments() {
        apartmentService.generateApartments();
    }

    @PostMapping("/apartment")
    @ResponseStatus(HttpStatus.CREATED)
    public Apartment createApartment(@RequestBody Apartment apartment) {
        return apartmentService.createApartment(apartment);
    }

    @PutMapping("/apartment")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Apartment> updateApartment(@RequestBody Apartment apartment) {
        return ResponseEntity.ok().body(apartmentService.updateApartment(apartment, apartment.getId()));
    }

    @DeleteMapping("/apartment/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteApartment(@PathVariable Long id) {
        apartmentService.deleteApartment(id);
    }

    @GetMapping("/apartment-region")
    @ResponseStatus(HttpStatus.OK)
    public List<Apartment> findApartmentByRegion(String region) {
        List<Apartment> apartments = new ArrayList<>();
        List<Complex> complexes = complexService.findApartmentByRegion(region);
        for (Complex complex : complexes) {
            apartments.addAll(complex.getApartments());
        }
        return apartments;
    }

}
