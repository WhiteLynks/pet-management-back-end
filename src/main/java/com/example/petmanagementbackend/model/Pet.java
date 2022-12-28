package com.example.petmanagementbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Pets")
public class Pet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Long code;
    private String type;
    private String color;

    public Pet() {
    }

    public Pet(String name, Long code, String type, String color) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }


}
