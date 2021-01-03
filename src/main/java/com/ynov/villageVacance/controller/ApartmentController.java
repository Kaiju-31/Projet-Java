/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.service.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ApartmentController {

    ApartmentService apartmentService;
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
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

    @PostMapping("/apartment/create/{bedding}/{area}/{babyEquipments}/{airConditioner}/{price}/{complex_id}")
    @ResponseStatus(HttpStatus.OK)
    public Apartment createApartment(@PathVariable Integer bedding,@PathVariable Integer area,@PathVariable Boolean babyEquipments,@PathVariable Boolean airConditioner,@PathVariable Float price,@PathVariable Long complex_id) {
        return apartmentService.createApartment(bedding, area, babyEquipments, airConditioner, price, complex_id);
    }

    @DeleteMapping("/apartment/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delApartment(@PathVariable Long id) {
        apartmentService.deleteApartment(id);
    }
}
