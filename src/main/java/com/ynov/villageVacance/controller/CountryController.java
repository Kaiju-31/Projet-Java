/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Country;
import com.ynov.villageVacance.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CountryController {

    CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    @ResponseStatus(HttpStatus.OK)
    public List<Country> getCountrys() {
        return countryService.getCountrys();
    }

    @GetMapping("/country/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateCountrys() {
        countryService.generateCountrys();
    }
}
