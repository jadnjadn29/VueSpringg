package com.cpe.backend;

import com.cpe.backend.entity.Doctor;
import com.cpe.backend.entity.Medicine;
import com.cpe.backend.entity.Patients;
import com.cpe.backend.entity.Prescribtion;
import com.cpe.backend.repository.DoctorRepository;
import com.cpe.backend.repository.MedicineRepository;
import com.cpe.backend.repository.PatientsRepository;
import com.cpe.backend.repository.PrescribtionRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	ApplicationRunner init(MedicineRepository medicineRepository, DoctorRepository doctorRepository ,PatientsRepository patientsRepository) {
		return args -> {

			Stream.of("paracetamol", "ibuprofen" ).forEach(name -> {
				Medicine medicine = new Medicine(); // สร้าง Object Medicine
				medicine.setName(name); // set ชื่อ (name) ให้ Object ชื่อ Medicine
				medicineRepository.save(medicine); // บันทึก Objcet ชื่อ Medicine
			});

			Stream.of("Takoonkan",  "Tanapon").forEach(name -> {
				Doctor doctor = new Doctor(); // สร้าง Object Doctor
				doctor.setName(name); // set ชื่อ (name) ให้ Object ชื่อ Doctor
				doctorRepository.save(doctor); // บันทึก Objcet ชื่อ Doctor
			});


			Stream.of("Sitthichai", "Somchai").forEach(name -> {
				Patients patients = new Patients(); // สร้าง Object Patients
				patients.setName(name); // set ชื่อ (name) ให้ Object ชื่อ Patients
				patientsRepository.save(patients); // บันทึก Objcet ชื่อ Patients
			});

		

			doctorRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity  Doctor บน Terminal
			medicineRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Medicine บน Terminal
			patientsRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity  Patients บน Terminal
			
		};
	}

}
