package com.example.petmanagementbackend.model;


import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "types")
public class PetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank
    private String type;

    public PetType(String type) {
        this.type = type;
    }

    public PetType() {

    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
