package com.cpe.backend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="Doctor")
public class Doctor {

    @Id
    @SequenceGenerator(name="doctor_seq",sequenceName="doctor_seq")               
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="doctor_seq")  
    @Column(name = "doctor_ID", unique = true, nullable = true)
    private @NotNull Long id;
    private @NotNull String name;

    @OneToOne(mappedBy = "people")
	
	@JsonIgnore
	private Prescribtion prescribtion;




	

}
