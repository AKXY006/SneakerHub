package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.WishlistRepository;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistRepository wishlistRepository;

}
