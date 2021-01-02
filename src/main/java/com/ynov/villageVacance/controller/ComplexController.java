/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.controller;

import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.service.ComplexService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
