package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

}
