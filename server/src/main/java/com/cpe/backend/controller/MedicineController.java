package com.cpe.backend.controller;

import com.cpe.backend.entity.Medicine;
import com.cpe.backend.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class MedicineController {

    @Autowired
    private final MedicineRepository medicineRepository;

    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @GetMapping("/medicine")
    public Collection<Medicine> Medicines() {
        return medicineRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/medicine/{id}")
    public Medicine getCompetitorById(@PathVariable("id") Long id) {
        return medicineRepository.findById(id).get();
    }

}