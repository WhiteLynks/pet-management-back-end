package com.example.petmanagementbackend.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank
    @Size(min = 1, max = 255)
    private String name;

    @NotBlank
    private Long code;

    @NotBlank
    @Size(min = 1, max = 40)
    private String type;

    @NotBlank
    @Size(min = 1, max = 40)
    private String color;

    public Pet() {
    }

    public Pet(String name, Long code, String type, String color) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.color = color;
    }

    public long getId() {
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
