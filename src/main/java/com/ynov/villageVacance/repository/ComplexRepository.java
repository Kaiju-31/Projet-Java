/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.repository;

import com.ynov.villageVacance.domain.Complex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {

    @Query(value = "SELECT c FROM Complex c WHERE c.id = :id")
    Complex findComplexById(Long id);

//    @Query(value = "SELECT c FROM Complex c JOIN Apartment a ON c.id = a.complex_id WHERE a.id = :id")
//    Complex findApartmentWithComplex(Long id);
}
