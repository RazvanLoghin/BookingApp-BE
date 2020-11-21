package com.booking.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController extends BaseController {

    private static final String API_NAME = "user";

    @GetMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity<String> getUser(@PathVariable long id) {
        return ResponseEntity.ok("user1");
    }

    @GetMapping("/users")
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity.ok("All users!");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> greetUser() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping(UserController.API_NAME)
    public ResponseEntity<String> createNewUser() {
        return ResponseEntity.ok("new user");
    }

    @PutMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity updateUser(@PathVariable long id) {
        return new ResponseEntity<>(String.format("User " + id, " has been updated!"), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id) {
        return new ResponseEntity<>(String.format("User " + id, " has been deleted!"), HttpStatus.ACCEPTED);

    }
}

