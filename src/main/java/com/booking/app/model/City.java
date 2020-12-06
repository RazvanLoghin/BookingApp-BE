package com.booking.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {

    @Column(unique = true)
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public City() {
    }

    public City(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
