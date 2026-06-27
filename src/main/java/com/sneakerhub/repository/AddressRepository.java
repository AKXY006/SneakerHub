package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
