package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Review;

public interface ReviewRespository extends JpaRepository<Review, Integer> {

}
