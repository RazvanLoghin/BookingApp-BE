package com.booking.app.model;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int floor;
    private long room_number;

    @ManyToOne
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public long getRoom_number() {
        return room_number;
    }

    public void setRoom_number(long room_number) {
        this.room_number = room_number;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
