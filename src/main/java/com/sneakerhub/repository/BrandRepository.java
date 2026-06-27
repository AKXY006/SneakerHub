package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
