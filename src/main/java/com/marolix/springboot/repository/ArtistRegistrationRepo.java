package com.marolix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.springboot.entity.ArtistRegistration;

public interface ArtistRegistrationRepo extends JpaRepository<ArtistRegistration, Integer> {

	


}
