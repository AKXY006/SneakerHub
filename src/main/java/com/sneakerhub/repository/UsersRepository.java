package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
