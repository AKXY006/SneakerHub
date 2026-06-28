package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
    private AddressRepository addressRepository;

}
