/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Apartment;
import com.ynov.villageVacance.service.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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

}
