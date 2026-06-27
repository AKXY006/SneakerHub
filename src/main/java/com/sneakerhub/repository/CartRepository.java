package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
