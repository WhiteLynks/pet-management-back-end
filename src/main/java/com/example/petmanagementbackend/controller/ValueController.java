package com.example.petmanagementbackend.controller;

import com.example.petmanagementbackend.model.PetColor;
import com.example.petmanagementbackend.model.PetType;
import com.example.petmanagementbackend.repository.PetColorRepoistory;
import com.example.petmanagementbackend.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ValueController {

    @Autowired
    private PetTypeRepository typeRepository;
    @Autowired
    private PetColorRepoistory colorRepository;

    @GetMapping("/values/types")
    public List<PetType> getTypes() {
        return typeRepository.findAll();
    }

    @GetMapping("/values/colors")
    public List<PetColor> getColors() {
        return colorRepository.findAll();
    }

}
