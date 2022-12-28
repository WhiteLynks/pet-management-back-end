package com.example.petmanagementbackend.repository;

import com.example.petmanagementbackend.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findAll();
}
