package com.hwealth.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Orders {
	@Id
	@GeneratedValue
	private long id;
	private double amount;	
	@ManyToOne(cascade=CascadeType.ALL)
	private Address address;
	
	//@Embedded
	@ElementCollection
	private List<OrderedProduct> orderedProducts;

}
