package com.cpe.backend.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.net.URLDecoder;

import com.cpe.backend.entity.Doctor;
import com.cpe.backend.entity.Medicine;
import com.cpe.backend.entity.Patients;
import com.cpe.backend.entity.Prescribtion;

import com.cpe.backend.repository.DoctorRepository;
import com.cpe.backend.repository.MedicineRepository;
import com.cpe.backend.repository.PatientsRepository;
import com.cpe.backend.repository.PrescribtionRepository;


import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class PrescribtionController {
    @Autowired
    private final PrescribtionRepository  prescribtionRepository;
   

    public PrescribtionController(PrescribtionRepository prescribtionRepository) {
        this.prescribtionRepository = prescribtionRepository;
    }

    @GetMapping("/prescribtion")
    public Collection<Prescribtion> prescribtions() {
        return prescribtionRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/prescribtion/{id}")
    public Prescribtion getVoteTypeById(@PathVariable("id") Long id) {
         return prescribtionRepository.findById(id).get();
    }

   // @PostMapping("/prescribtion/{doctor_id}/{medicine_id}/{patients_id}/{prescribtion_id}")
   // public Prescribtion newPrescribtion(Prescribtion newPrescribtion,
   // @PathVariable long doctor_id,
   // @PathVariable long medicine_id,
   // @PathVariable long patients_id) {
   

     //Doctor doctors = doctorRepository.findById(doctor_id);
     //Medicine medicines = medicineRepository.findById(medicine_id);
     //Patients patients = patientsRepository.findById(patients_id);
     //Prescribtion newPrescribtion = new Prescribtion();
  
  

    //newPrescribtion.setDoctor(doctors);
    //newPrescribtion.setMedicine(medicine);
    //newPrescribtion.setPatients(patients);
    
   

    //return prescribtionRepository.save(newPrescribtion); //บันทึก Objcet ชื่อ Prescribtion
    
    //}
}