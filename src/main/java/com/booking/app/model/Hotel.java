package com.booking.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;
    private String address;
    private int rating;
    private boolean status;

    @ManyToMany
    private User manager;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="hotel", orphanRemoval = true)
    @MapKeyColumn(name="id")
    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(String name, String address, int rating, boolean status, User manager, ArrayList<Room> rooms) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.status = status;
        this.manager = manager;
        this.rooms = rooms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
