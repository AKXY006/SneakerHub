package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
