/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.repository;

import com.ynov.villageVacance.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

    @Query(value = "SELECT a FROM Apartment a WHERE a.id = :id")
    Apartment findApartmentById(Long id);

//    @Query(value = "SELECT NEW com.ynov.villageVacance.domain.ApartmentDto(a) FROM Apartment a JOIN Complex c ON a.complex_id = c.id WHERE c.region = :region")
//    List<ApartmentDto> findApartmentByRegion(String region);

    // SELECT NEW com.ynov.demo.concession.domain.ConcessionDto(c.name, count(v)) FROM Concession c LEFT JOIN c.vehicles v GROUP BY c.id
}
