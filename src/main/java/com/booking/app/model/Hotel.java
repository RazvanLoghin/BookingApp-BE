package com.booking.app.model;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(unique = true)
    private String name;
    private String address;
    private int rating;
    private boolean status;


    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    public Hotel() {
    }

    public Hotel(String name, String address, int rating, boolean status, ArrayList<Room> rooms) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.status = status;
        this.rooms = rooms;
    }
}
