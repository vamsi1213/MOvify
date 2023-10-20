package com.marolix.springboot.service;

import org.springframework.stereotype.Service;

import com.marolix.springboot.dto.ArtistRegistrationDto;
@Service
public interface ArtistRegistrationService {
    
	 public ArtistRegistrationDto registerNewArtist(ArtistRegistrationDto artistRegistrationDto);
}
