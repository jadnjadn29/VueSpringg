package com.cpe.backend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="Receipt")
public class Receipt {

    @Id
    @SequenceGenerator(name="receipt_seq",sequenceName="receipt_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="receipt_seq")  
    @Column(name = "receipt_ID", unique = true, nullable = true)
    private @NotNull Long id;
    //private @NonNull String name;


    @ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL) 
    @JoinColumn(name="receiptId")
    @JsonIgnore
    private Prescribtion prescribtion;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="medicineId")
    @JsonIgnore
    private Medicine medicineId;


  
}