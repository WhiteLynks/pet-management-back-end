package com.example.petmanagementbackend.controller;

import com.example.petmanagementbackend.model.Pet;
import com.example.petmanagementbackend.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository repository;

    @GetMapping("/pets")
    public List<Pet> index() {
        return repository.findAll();
    }

}
