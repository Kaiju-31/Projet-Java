/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.repository;

import com.ynov.villageVacance.domain.Complex;
import com.ynov.villageVacance.domain.ComplexDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {

    @Query(value = "SELECT c FROM Complex c WHERE c.id = :id")
    Complex findComplexById(Long id);

    @Query(value = "SELECT c FROM Complex c WHERE c.id = :id")
    List<Complex> getComplexById(Long id);

    @Query(value = "SELECT c FROM Complex c WHERE c.country = :country")
    List<Complex> findComplexByCountry(String country);

    @Query(value = "SELECT c FROM Complex c WHERE c.region = :region")
    List<Complex> findApartmentByRegion(String region);

    @Query(value = "SELECT c FROM Complex c WHERE c.swimmingPool = true")
    List<Complex> findApartmentWithSwimmingpool();

    @Query(value = "SELECT c FROM Complex c WHERE c.location = 'MOUNTAIN'")
    List<Complex> findApartmentAtMountain();

//    @Query(value = "SELECT c FROM Complex c JOIN Apartment a ON c.id = a.complex_id WHERE a.id = :id")
//    Complex findApartmentWithComplex(Long id);
}
