/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.domain.ComplexDto;
import com.ynov.villageVacance.service.ComplexService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ComplexController {

    ComplexService complexService;

    public ComplexController(ComplexService complexService) {
        this.complexService = complexService;
    }

    @GetMapping("/complex")
    @ResponseStatus(HttpStatus.OK)
    public List<Complex> getComplexs() {
        return complexService.getComplexs();
    }

    @GetMapping("/complex/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateComplexs() {
        complexService.generateComplexs();
    }

    @PostMapping("/complex")
    @ResponseStatus(HttpStatus.CREATED)
    public Complex createComplex(@RequestBody Complex complex) {
        return complexService.createComplex(complex);
    }

    @PutMapping("/complex")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Complex> updateComplex(@RequestBody Complex complex) {
        return ResponseEntity.ok().body(complexService.updateComplex(complex, complex.getId()));
    }

    @DeleteMapping("/complex/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteComplex(@PathVariable Long id) {
        complexService.deleteComplex(id);
    }

    @GetMapping("/complex-country")
    @ResponseStatus(HttpStatus.OK)
    public List<Complex> findComplexByCountry(String country) {
        return complexService.findComplexByCountry(country);
    }
}
