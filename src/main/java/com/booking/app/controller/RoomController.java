package com.booking.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController extends BaseController {
    private static final String API_NAME = "rooms";

    @PostMapping(RoomController.API_NAME + "/{id}")
    public ResponseEntity<String> createRoom(@PathVariable long id) {
        return ResponseEntity.ok("Room created!");
    }

    @PutMapping(RoomController.API_NAME + "/{id}")
    public ResponseEntity<String> updateRoomStatus(@PathVariable long id) {
        return new ResponseEntity<>(String.format("Room status " + id, " has been changed!"), HttpStatus.ACCEPTED);
    }

    @GetMapping("rooms")
    public ResponseEntity<String> showRooms(@PathVariable long id) {
        return ResponseEntity.ok("All available rooms!");
    }
}
