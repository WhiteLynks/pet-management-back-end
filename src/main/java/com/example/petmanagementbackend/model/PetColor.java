package com.example.petmanagementbackend.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "colors")
public class PetColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank
    private String color;

    public PetColor(String color) {
        this.color = color;
    }

    public PetColor() {

    }

    public long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

}
