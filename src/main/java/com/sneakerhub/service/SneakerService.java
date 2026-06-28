package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.SneakerRepository;

@Service
public class SneakerService {
	
	@Autowired
	private SneakerRepository sneakerRepository;

}
