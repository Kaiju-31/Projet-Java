/*
 * Copyright (c) 2021.
 * Rodolf Chotard
 */

package com.ynov.villageVacance.repository;

import com.ynov.villageVacance.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

    @Query(value = "SELECT a FROM Apartment a WHERE a.id = :id")
    Apartment findApartmentById(Long id);

    @Query(value = "SELECT a FROM Apartment a WHERE a.id = :id")
    List<Apartment> getApartmentById(Long id);

    @Query(value = "SELECT a FROM Apartment a WHERE a.bookingStart = :bookingstart AND a.bookingEnd = :bookingend")
    List<Apartment> getApartmentByDate(LocalDate bookingstart, LocalDate bookingend);

}
