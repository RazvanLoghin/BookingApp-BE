package com.booking.app.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int floor;
    private long room_number;

    @ManyToOne()
    private Hotel hotel;

    private int price;

    public Room() {
    }

    public Room(long id, int floor, long room_number, Hotel hotel, int price) {
        this.id = id;
        this.floor = floor;
        this.room_number = room_number;
        this.hotel = hotel;
        this.price = price;
    }
}
