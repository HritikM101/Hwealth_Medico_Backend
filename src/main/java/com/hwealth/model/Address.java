package com.hwealth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
	@GeneratedValue
	@Id
	private long addressId;
	private String fullAddress;
	private String city;
	private String state;
	private String country;
	private long phoneno;
	private long pinCode;

}
