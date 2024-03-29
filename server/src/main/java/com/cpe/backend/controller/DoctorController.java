package com.cpe.backend.controller;

import com.cpe.backend.entity.Doctor;
import com.cpe.backend.repository.DoctorRepository;
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
public class DoctorController {

    @Autowired
    private final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/doctor")
    public Collection<Doctor>Doctors() {
        return doctorRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/doctor/{id}")
    public Doctor getCompetitorById(@PathVariable("id") Long id) {
        return doctorRepository.findById(id).get();
    }
    

}