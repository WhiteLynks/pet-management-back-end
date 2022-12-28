package com.example.petmanagementbackend.repository;

import com.example.petmanagementbackend.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Long> {

    List<Pet> findAll();
}
