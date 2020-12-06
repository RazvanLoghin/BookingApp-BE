package com.booking.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController extends BaseController {
    public static final String API_NAME = "hotels";

    @GetMapping(HotelController.API_NAME + "/{id}")
    public ResponseEntity<String> getHotel(@PathVariable long id) {
        return ResponseEntity.ok("Hotel Y");
    }

    @GetMapping(HotelController.API_NAME)
    public ResponseEntity<String> getAllHotels() {
        return ResponseEntity.ok("All hotels listed!");
    }
}
