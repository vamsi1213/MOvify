package com.marolix.springboot.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ArtistAddressDto {
    
	@Column(name = "address_line1", nullable = false)
	private String addressLine1;

	@Column(name = "address_line2", nullable = false)
	private String addressLine2;

	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "pincode", nullable = false)
    private String pincode;
	
	@Column(name = "state", nullable = false)
     private String state;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
