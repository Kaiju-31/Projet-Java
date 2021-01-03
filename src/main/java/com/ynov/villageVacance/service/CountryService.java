/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.service;

import com.ynov.villageVacance.domain.Country;
import com.ynov.villageVacance.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountrys() {
        return countryRepository.findAll();
    }

    public void generateCountrys() {
        Country country = new Country();
        country.setName("France");
        countryRepository.save(country);
    }
}
