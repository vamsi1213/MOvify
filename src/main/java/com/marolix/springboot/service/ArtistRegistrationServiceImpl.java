package com.marolix.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolix.springboot.dto.ArtistRegistrationDto;
import com.marolix.springboot.entity.ArtistAddress;
import com.marolix.springboot.entity.ArtistRegistration;
import com.marolix.springboot.repository.ArtistAddressRepo;
import com.marolix.springboot.repository.ArtistRegistrationRepo;
@Service
public class ArtistRegistrationServiceImpl implements ArtistRegistrationService {

	
	@Autowired
	private ArtistRegistrationRepo artistRegistrationRepo;
	
	@Autowired
	private ArtistAddressRepo artistAddressRepo;
	
	@Override
	public ArtistRegistrationDto registerNewArtist(ArtistRegistrationDto artistRegistrationDto) {
        
		 ArtistRegistration ar=new ArtistRegistration();
		 ar.setFirstName(artistRegistrationDto.getFirstName());
		 ar.setLastName(artistRegistrationDto.getLastName());
		 ar.setEmail(artistRegistrationDto.getEmail());
		 ar.setProfession(artistRegistrationDto.getProfession());
		 ar.setWorkingLocation(artistRegistrationDto.getWorkingLocation());
		 ar.setPhoneNumber(artistRegistrationDto.getPhoneNumber());
		 
		 List<ArtistAddress> list=artistRegistrationDto.getAddress().stream().map(p->
		 {
			 ArtistAddress addr=new ArtistAddress();
			 addr.setAddressLine1(p.getAddressLine1());
			 addr.setAddressLine2(p.getAddressLine2());
			 addr.setCountry(p.getCountry());
			 addr.setPincode(p.getPincode());
			 addr.setState(p.getState());
			 return addr;
			 
			 
		 }).collect(Collectors.toList());
		 ar.setAddress(list);
				 
				 
		 artistRegistrationRepo.save(ar);
		 
				 
				 
		return artistRegistrationDto;
	}

	public ArtistAddressRepo getArtistAddressRepo() {
		return artistAddressRepo;
	}

	public void setArtistAddressRepo(ArtistAddressRepo artistAddressRepo) {
		this.artistAddressRepo = artistAddressRepo;
	}

}
