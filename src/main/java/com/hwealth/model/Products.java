package com.hwealth.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Products {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@Embedded
	private Manufacturer manufacturer;
	private String form;
	
	@Embedded
	private Price price;
	
	private boolean in_stock;
}
//"product_id": 1,
//"name": "Panadol Extra Strength",
//"manufacturer": {
//  "name": "GlaxoSmithKline",
//  "url": "https://www.gsk.com/"
//},
//"form": "20 Tablets in 1 Bottle",
//"product_url": "https://www.example.com/medicine/panadol-extra-strength-p1",
//"image": "https://example.com/images/panadol.jpg",
//"price": {
//  "mrp": 15.99,
//  "final_price": 12.99,
//  "discount_perc": 19
//},
//"in_stock": true,
//"id": "fb3c"
