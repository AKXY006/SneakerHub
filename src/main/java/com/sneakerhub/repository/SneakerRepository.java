package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Sneaker;

public interface SneakerRepository extends JpaRepository<Sneaker, Integer>{

}
