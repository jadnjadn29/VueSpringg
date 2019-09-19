package com.cpe.backend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@Entity
@NoArgsConstructor
@Table(name="Prescribtion")
public class Prescribtion {
	@Id
	@SequenceGenerator(name="prescribtion_seq",sequenceName="prescribtion_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="prescribtion_seq")
	@Column(name="prescribtion_ID",unique = true, nullable = true)
	private @NotNull Long id;
	
	

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Patients.class)
	@JoinColumn(name = "patientsId", insertable = true)
	@JsonManagedReference
	private @NotNull Patients patientsId;
	

	@OneToOne(fetch = FetchType.EAGER, targetEntity = Doctor.class)
	@JoinColumn(name = "doctorId", insertable = true)
	@JsonManagedReference
    private  Doctor doctorId;

	@OneToMany(fetch = FetchType.EAGER,mappedBy = "prescribtion")
	@JsonManagedReference
	private Collection<Receipt> receiptId;


}