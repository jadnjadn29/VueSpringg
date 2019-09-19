package com.cpe.backend.entity;
import lombok.*;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@Table(name="Medicine")
public class Medicine {
    @Id
    @SequenceGenerator(name="medicine_seq",sequenceName="medicine_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="medicine_seq")
    @Column(name="medicine_ID",unique = true, nullable = true)
    private @NotNull Long id;
    private @NotNull String name;
    private @NotNull String school;
    

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "medicine")
    private Collection<Receipt> receiptId;

	
}