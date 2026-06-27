package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
