package com.marolix.springboot.dto;

import java.util.List;

import com.marolix.springboot.entity.ArtistAddress;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ArtistRegistrationDto {
      
	@Column(name="first_name", nullable=false)
	private String firstName;
	@Column(name="last_name", nullable=false)
	private String lastName;	
	@Column(name="profession", nullable=false)
    private String profession;
	@Column(name="working_location", nullable=false)
	private String workingLocation;
	@Column(name="email", nullable=false)
	private String email;
	private Integer phoneNumber;
	
	List<ArtistAddress> address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<ArtistAddress> getAddress() {
		return address;
	}

	public void setAddress(List<ArtistAddress> address) {
		this.address = address;
	}
	

}
