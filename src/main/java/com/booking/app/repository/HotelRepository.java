package com.booking.app.repository;

import com.booking.app.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    Optional<Hotel> findByName(String name);
    Optional<Hotel> findByRating(int rating);

}
