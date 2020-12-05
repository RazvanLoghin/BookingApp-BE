package com.booking.app.controller;

import com.booking.app.model.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController extends BaseController {
    public static final String API_NAME = "cities";

    @GetMapping(CityController.API_NAME + "/{id}")
    public ResponseEntity<String> getCity(@PathVariable long id) {
        return ResponseEntity.ok("City One");
    }

    @GetMapping("/cities")
    public ResponseEntity<String> getAllCities() {
        return ResponseEntity.ok("All cities listed!");
    }
}
