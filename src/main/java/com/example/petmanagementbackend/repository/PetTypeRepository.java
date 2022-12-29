package com.example.petmanagementbackend.repository;

import com.example.petmanagementbackend.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
