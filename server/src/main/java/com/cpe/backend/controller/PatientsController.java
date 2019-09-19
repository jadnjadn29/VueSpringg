package com.cpe.backend.controller;


import com.cpe.backend.entity.Patients;
import com.cpe.backend.repository.PatientsRepository;
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
public class PatientsController {

    @Autowired
    private final PatientsRepository patientsRepository;

    public PatientsController(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @GetMapping("/patients")
    public Collection<Patients> Patientss() {
        return patientsRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/patients/{id}")
    public Patients getCompetitorById(@PathVariable("id") Long id) {
        return patientsRepository.findById(id).get();
    }

}