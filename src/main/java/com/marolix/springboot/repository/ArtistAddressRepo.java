package com.marolix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.springboot.entity.ArtistAddress;

public interface ArtistAddressRepo extends JpaRepository<ArtistAddress, Integer> {

}
