package com.sneakerhub.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String paymentMethod;
    private String paymentStatus;
    private String transactionId;
    private Double amount;
    private String currency;
    private LocalDateTime paymentDate;
    private Boolean refundStatus;

}