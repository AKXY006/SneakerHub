package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Wishlist;

public interface WishlistRespository extends JpaRepository<Wishlist, Integer>{

}
