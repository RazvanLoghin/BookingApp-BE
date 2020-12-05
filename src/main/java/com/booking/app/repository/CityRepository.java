package com.booking.app.repository;

import com.booking.app.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findByName(String name);
//    Optional<City> findByZipCode(long zipCode);

}
