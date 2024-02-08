package com.hwealth.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Embeddable
public class OrderedProduct {
    
	private long productId;
	private long quantity;
	
	
}
