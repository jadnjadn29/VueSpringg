package com.cpe.backend.repository;

import com.cpe.backend.entity.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public
interface DoctorRepository extends JpaRepository<Doctor, Long> {
	Doctor findById(long id);
}