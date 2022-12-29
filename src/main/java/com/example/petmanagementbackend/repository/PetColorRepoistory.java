package com.example.petmanagementbackend.repository;

import com.example.petmanagementbackend.model.PetColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetColorRepoistory extends JpaRepository<PetColor, Long> {
}
