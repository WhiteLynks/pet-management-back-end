package com.example.petmanagementbackend.controller;

import com.example.petmanagementbackend.model.Pet;
import com.example.petmanagementbackend.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PetController {

    @Autowired
    private PetRepository petRepo;

    @GetMapping("/pets")
    public List<Pet> index() {
        return petRepo.findAll();
    }

    @PostMapping("/pets")
    public Pet AddPet(@RequestBody Pet newPet) {
        petRepo.save(newPet);
        return newPet;
    }

}
