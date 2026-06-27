package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
