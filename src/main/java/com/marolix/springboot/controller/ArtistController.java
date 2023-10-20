package com.marolix.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.springboot.dto.ArtistRegistrationDto;
import com.marolix.springboot.service.ArtistRegistrationService;

@RestController
public class ArtistController {
	
	
	@Autowired 
	private ArtistRegistrationService artistRegistrationService;
	@PostMapping("/post")
    public ResponseEntity<ArtistRegistrationDto> registerNewArtist(@RequestBody ArtistRegistrationDto artistRegistrationDto){
    	
    	return new ResponseEntity<ArtistRegistrationDto>
    	(artistRegistrationService.registerNewArtist(artistRegistrationDto),HttpStatus.CREATED);
    }
}
